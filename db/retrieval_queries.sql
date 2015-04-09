USE housing;
/************************************************************************************/
SELECT temp.name,MAX(temp.number)
FROM (SELECT H.name AS name, COUNT(DISTINCT R.student_id) AS number
FROM residence_hall H, lease_request R
WHERE R.preference1 = H.name OR R.preference2 = H.name OR R.preference3 = H.name
GROUP BY H.name
UNION
SELECT GA.name, COUNT(DISTINCT R.student_id)
FROM general_apartment GA, lease_request R
WHERE R.preference1 = GA.name OR R.preference2 = GA.name OR R.preference3 = GA.name
GROUP BY GA.name
UNION
SELECT FA.name, COUNT(DISTINCT R.student_id)
FROM family_apartment FA, lease_request R
WHERE R.preference1 = FA.name OR R.preference2 = FA.name OR R.preference3 = FA.name
GROUP BY FA.name) AS temp
/***************************************************************************/

/***************************************************************************/
SELECT * 
FROM lease_request LR
WHERE LR.status = "pending" AND LR.student_id NOT IN
(SELECT PR.student_id
FROM parking_request PR);


