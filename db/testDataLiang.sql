INSERT INTO `housing`.`student` (`id`,`password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `comment`, `status`, `courses`, `kin_id`) 
VALUES ('100540001','123456', 'Harry', 'Potter', 'student', 'male', '9189327078', '9176326078', '31 B, Privet Drive, London - 27605, England', 'San Jose', '29191', '1991-07-21', 'Freshman', 'British', 'No', 'No', null, 'placed', 'CS','1');

remove city, postcode
add family,Family details


Housing : Gryffindor Hall
Place Number : 001
Parking spot : 003
Lease Start Date (also parking) : 01 Jan 2014
Lease End Date: 31 Jul 2014
Payment Option: Semester

should be put in lease and parking, room number is not given


INSERT INTO `housing`.`staff` (`id`,`password`, `fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) 
VALUES ('1','admin', 'Minerva', 'McGonagall', 'McGonagall Road, Delhi - 011, India', null, null, '1950-10-04', 'Female', 'Hall Manager', 'Gryffindor Hall');

Relationship between staff and hall 