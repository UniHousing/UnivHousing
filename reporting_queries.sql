/*Reporting Queries*/
USE housing;
SELECT H.name, COUNT(DISTINCT S.id) spot_num
FROM residence_hall H, nearby N, parking_spot S
WHERE H.id = N.house_id AND N.lot_id = S.lot_id
GROUP BY H.name
UNION
SELECT GA.name, COUNT(DISTINCT S.id)
FROM general_apartment GA, nearby N, parking_spot S
WHERE GA.id = N.house_id AND N.lot_id = S.lot_id
GROUP BY GA.name
UNION
SELECT FA.name, COUNT(DISTINCT S.id)
FROM family_apartment FA, nearby N, parking_spot S
WHERE FA.id = N.house_id AND N.lot_id = S.lot_id
GROUP BY FA.name; -- 1
/*****************************************************************/
SELECT H.name, COUNT(DISTINCT S.id) grads_num
FROM  residence_hall H
LEFT JOIN lease_request R ON R.preference1 = H.name OR R.preference2 = H.name OR R.preference3 = H.name
LEFT JOIN student S ON R.student_id = S.id  AND S.category = "Graduate" AND R.status = "pending"
GROUP BY H.name; -- 2
/*****************************************************************/
-- 3
/*****************************************************************/
SELECT S.id spot,S.lot_id lot,H.addr location, S.classification type
FROM parking_spot S, nearby N, residence_hall H
WHERE S.lot_id = N.lot_id AND N.house_id = H.id AND S.availability = "available"
GROUP BY S.id
UNION 
SELECT S.id spot,S.lot_id lot,GA.addr location, S.classification type
FROM parking_spot S, nearby N, general_apartment GA
WHERE S.lot_id = N.lot_id AND N.house_id = GA.id AND S.availability = "available" 
GROUP BY S.id
UNION 
SELECT S.id spot,S.lot_id lot,FA.addr location, S.classification type
FROM parking_spot S, nearby N, family_apartment FA
WHERE S.lot_id = N.lot_id AND N.house_id = FA.id  AND S.availability = "available"
GROUP BY S.id
UNION
SELECT S.id spot,S.lot_id lot,"General" location, S.classification type
FROM parking_spot S
WHERE S.lot_id = "7" AND S.availability = "available"
GROUP BY S.id
