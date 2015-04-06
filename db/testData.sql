--update housing id
UPDATE `housing`.`general_apartment` SET `id`='6' WHERE `id`='1';
UPDATE `housing`.`general_apartment` SET `id`='5' WHERE `id`='4';
UPDATE `housing`.`general_apartment` SET `id`='4' WHERE `id`='3';
UPDATE `housing`.`general_apartment` SET `id`='3' WHERE `id`='2';
UPDATE `housing`.`family_apartment` SET `id`='7' WHERE `id`='1';
UPDATE `housing`.`family_apartment` SET `id`='8' WHERE `id`='2';
UPDATE `housing`.`family_apartment` SET `id`='9' WHERE `id`='3';

--room
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('1', '1');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('2', '1');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('3', '1');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('4', '1');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('5', '1');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('6', '2');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('7', '2');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('8', '2');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('1', '3');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('2', '3');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('3', '3');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('4', '4');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('5', '4');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('6', '4');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('7', '4');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('8', '5');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('9', '5');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('10', '5');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('11', '6');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('12', '6');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('13', '6');
INSERT INTO `housing`.`room` (`id`, `house_id`) VALUES ('14', '6');


--lease
INSERT INTO `housing`.`lease` (`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`) VALUES ('100540001', '001', '2014-01-01', '2014-07-31', 'Semester');
INSERT INTO `housing`.`lease` (`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`) VALUES ('100540002', '001', '2014-01-01', '2014-07-31', 'Semester');
INSERT INTO `housing`.`lease` (`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`) VALUES ('100540003', '002', '2014-01-01', '2014-05-31', 'Monthly');
INSERT INTO `housing`.`lease` (`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`) VALUES ('100540004', '003', '2014-01-01', '2014-07-31', 'Monthly');
INSERT INTO `housing`.`lease` (`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`) VALUES ('100540005', '008', '2014-01-01', '2014-05-31', 'Monthly');
INSERT INTO `housing`.`lease` (`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`) VALUES ('100540006', '009', '2014-01-01', '2014-07-31', 'Semester');
INSERT INTO `housing`.`lease` (`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`) VALUES ('100540007', '006', '2014-01-01', '2014-07-31', 'Semester');
INSERT INTO `housing`.`lease` (`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`) VALUES ('200540001', '004', '2014-05-01', '2014-04-30', 'Monthly');
INSERT INTO `housing`.`lease` (`student_id`, `room_id`, `enter_date`, `leave_date`, `payment`) VALUES ('200540002', '005', '2014-04-01', '2014-04-30', 'Monthly');
INSERT INTO `housing`.`lease` (`student_id`, `house_id`, `enter_date`, `leave_date`, `payment`) VALUES ('100540008', '107', '2014-01-01', '2014-07-31', 'Semester');


--kin
INSERT INTO `housing`.`kin_info` (`name`, `relationship`, `addr`, `tel`) VALUES ('Sirius Black', 'Godfather', '12, Grimmauld Place', '9439560752');
INSERT INTO `housing`.`kin_info` (`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('Lucius Malfoy', 'Father', '31 B, Malfoy Drive, New York- 27506, USA', 'New York', '27506', '9439560752');
INSERT INTO `housing`.`kin_info` (`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('Aurthur Weasley', 'Father', '31 B, Weasley Road, Rome - 27456, Italy', 'Rome', '27456', '9436660752');
INSERT INTO `housing`.`kin_info` (`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('Mr. Granger', 'Father', '32 A, Granger Road, Edinburg- 25556, Scotland', 'Edinburg', '25556', '9433360752');
INSERT INTO `housing`.`kin_info` (`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('Igor Karkaroff', 'Headmaster', '32 A, Krum Road, Sofia- 2221, Bulgaria', 'Bulgaria', '2221', '94363530752');
INSERT INTO `housing`.`kin_info` (`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('Bathilda Bagshot', 'Friend', '32 A, Bagshot Road, Zurich- 35221, Switzerland', 'Zurich', '35221', '94363595752');
INSERT INTO `housing`.`kin_info` (`name`, `relationship`, `addr`, `city`, `post_code`, `tel`) VALUES ('Petunia Dursley', 'Wife', '32 A, Dursley Road, Raleigh- 27606, USA', 'Raleigh', '27606', '94363654752');


--tiket
INSERT INTO `housing`.`ticket` (`student_id`, `date`, `issue`, `status`, `comment`) VALUES ('100540001', '2015-04-06', 'Water', 'Pending', 'No water');
INSERT INTO `housing`.`ticket` (`student_id`, `date`, `issue`, `status`, `comment`) VALUES ('100540003', '2015-03-30', 'Internet', 'Complete', 'Internet not working');
INSERT INTO `housing`.`ticket` (`student_id`, `date`, `issue`, `status`, `comment`) VALUES ('100540007', '2015-03-15', 'Cleaning', 'Complete', 'Cleaning');
INSERT INTO `housing`.`ticket` (`student_id`, `date`, `issue`, `status`, `comment`) VALUES ('200540002', '2015-04-02', 'Miscellaneous', 'Pending', 'Window broken');


--supervisor
INSERT INTO `housing`.`staff` (`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('Minerva', 'McGonagall', 'McGonagall Road, Delhi - 011, India', 'Delhi', '011', '1950-10-04', 'Female', 'Hall Manager', 'Gryffindor Hall');
INSERT INTO `housing`.`staff` (`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('Severus', 'Snape', 'Snape Road, Lahore - 007, Pakistan', 'Lahore', '007', '1953-09-07', 'Male', 'Hall Manager', 'Slytherin Hall');
INSERT INTO `housing`.`staff` (`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('Filius', 'Flitwick', 'Flitwick Road, Sydney - 050, Australia', 'Sydney', '050', '1960-10-06', 'Male', 'Hall Manager', 'Ravenclaw');
INSERT INTO `housing`.`staff` (`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('Pomona', 'Sprout', 'Sprout Road, Berlin - 05963, Germany', 'Berlin', '05963', '1965-10-16', 'Female', 'Hall Manager', 'Hufflepuff');
INSERT INTO `housing`.`staff` (`fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('Albus', 'Dumbledore', 'Dumbledore Road, Gandhinagar - 382007, India', 'Gandhinagar', '382007', '1945-04-23', 'Male', 'Hall Manager', 'Hogwarts');


--guest
INSERT INTO `housing`.`guest` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `status`, `courses`) VALUES ('200540001', 'Viktor', 'Krum', 'Student', 'Male', '9198333567', '9198332233', '32 A, Krum Road, Sofia', 'Sofia', '2221', '1982-11-29', 'Visitor', 'Bulgarian', 'Yes', 'Placed', 'Coaching - Triwizard Cup');
INSERT INTO `housing`.`guest` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `courses`) VALUES ('200540002', 'Olympe', 'Maxime', 'Student', 'Female', '9197773567', '32 A, Maxime Road, Paris', 'Paris', '2331', '1970-05-19', 'Visitor', 'French', 'Yes', 'Guest Lecturer - Triwizard Cup');

--student
INSERT INTO `housing`.`student` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `status`, `courses`) VALUES ('100540008', 'Vernon', 'Dursley', 'Family', 'Male', '9198954357', '9198954786', '32 A, Dursley Road, Raleigh', 'Raleigh', '27606', '1975-11-29', 'Graduate', 'American', 'Yes', 'Placed', 'Muggle Studies');
INSERT INTO `housing`.`student` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540003', 'Ron', 'Weasley', 'Student', 'Male', '9189567067', '31 B, Weasley Road, Rome', 'Rome', '27456', '1986-03-01', 'Freshman', 'Italian', 'No', 'None', 'Placed', 'Care of Magical Creatures');
INSERT INTO `housing`.`student` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540004', 'Hermione', 'Granger', 'Student', 'Female', '9189568567', '32 A, Granger Road, Edinburg', 'Edinburg', '25556', '1986-09-19', 'Freshman', 'Scottish', 'No', 'None', 'Placed', 'Muggle Studies');
INSERT INTO `housing`.`student` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540005', 'Fred', 'Weasley', 'Student', 'Male', '9133368567', '9133368511', '31 B, Weasley Road, Rome', 'Rome', '27456', '1982-10-20', 'Senior', 'Italian', 'No', 'None', 'Placed', 'Muggle Studies');
INSERT INTO `housing`.`student` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540006', 'George', 'Weasley', 'Student', 'Male', '9133368568', '31 B, Weasley Road,Rome', 'Rome', '27456', '1982-10-20', 'Senior', 'Italian', 'No', 'None', 'Placed', 'Muggle Studies');
UPDATE `housing`.`student` SET `addr`='31 B, Malfoy Drive, New York' WHERE `id`='100540002';
INSERT INTO `housing`.`student` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540007', 'Bill', 'Weasley', 'Family', 'Male', '9198568567', '32 A, William Road, Brussels', 'Brussels', '2535', '1982-11-29', 'Graduate', 'Belgian', 'No', 'Difficulty in walking', 'Placed', 'Potions');
INSERT INTO `housing`.`student` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540001', 'Harry', 'Potter', 'Student', 'Male', '9189327078', '9176326078', '31 B, Privet Drive, London - 27605, England', 'London', '27605', '1991-07-21', 'Freshman', ' British', 'No', 'None', 'Placed', 'Defence Against Dark Arts');
INSERT INTO `housing`.`student` (`id`, `fname`, `lname`, `type`, `gender`, `tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `status`, `courses`) VALUES ('100540002', 'Draco', 'Malfoy', 'Student', 'Male', '9189327067', '31 B, Malfoy Drive, New York- 27506, USA', 'New York', '27506', '1990-06-05', 'Freshman', 'American', 'Yes', 'None', 'Placed', 'Muggle Studies');


--general_apartment
INSERT INTO `housing`.`general_apartment` (`name`, `addr`, `tel`, `room_count`, `bath_count`) VALUES ('Hufflepuff', '515, University Commons, Raleigh - 27606, NC', '919 540 004', '3', '3');
INSERT INTO `housing`.`general_apartment` (`name`, `addr`, `tel`, `room_count`, `bath_count`) VALUES ('Hufflepuff', '515, University Commons, Raleigh - 27606, NC', '919 540 004', '4', '4');
INSERT INTO `housing`.`general_apartment` (`name`, `addr`, `tel`, `room_count`, `bath_count`) VALUES ('Ravenclaw', '315, Gorman Crossings, Raleigh - 27606, NC', '919 540 003', '3', '3');
INSERT INTO `housing`.`general_apartment` (`name`, `addr`, `tel`, `room_count`, `bath_count`) VALUES ('Ravenclaw', '315, Gorman Crossings, Raleigh - 27606, NC', '919 540 003', '4', '4');

--family_apartment
INSERT INTO `housing`.`family_apartment` (`name`, `addr`, `tel`, `apt_num`, `bed_count`, `month_rate`, `deposit`) VALUES ('Hogwarts', '300, Wade Avenue, Raleigh - 27606, NC', ' 919 540 005', '1', '1', '450', '500');
INSERT INTO `housing`.`family_apartment` (`name`, `addr`, `tel`, `apt_num`, `bed_count`, `month_rate`, `deposit`) VALUES ('Hogwarts', '300, Wade Avenue, Raleigh - 27606, NC', ' 919 540 005', '2', '2', '550', '600');
INSERT INTO `housing`.`family_apartment` (`name`, `addr`, `tel`, `apt_num`, `bed_count`, `month_rate`, `deposit`) VALUES ('Hogwarts', '300, Wade Avenue, Raleigh - 27606, NC', ' 919 540 005', '3', '3', '700', '800');

--residential_hall
UPDATE `housing`.`residence_hall` SET `room_count`='5', `rent`='400', `deposit`='400' WHERE `id`='1';
INSERT INTO `housing`.`residence_hall` (`name`, `addr`, `room_count`, `tel`, `rent`, `deposit`) VALUES ('Slytherin Hall', '210 Dan Allen Dr, Raleigh, NC 27695', '3', '919 540 002', '450', '500');
INSERT INTO `housing`.`residence_hall` (`name`, `addr`, `tel`) VALUES ('Gryffindor Hall', '2751 Cates Avenue, Gryffindor Residence Hall, Raleigh, NC 27607', '919 540 001');
UPDATE `housing`.`residence_hall` SET `tel`='919 540 002' WHERE `id`='2';
