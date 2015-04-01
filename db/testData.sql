UPDATE `housing`.`lease` SET `parking_id`='12' WHERE `id`='1';
INSERT INTO `housing`.`lease` (`student_id`, `house_id`, `room_id`, `room_num`, `duration`, `enter_date`, `leave_date`, `deposit`, `payment`, `penalty`, `inspect_date`) VALUES ('1', '1', '1', '1', '123', '2015-03-31', '2015-04-01', '123', '12', '123', '2015-04-02','1');
INSERT INTO `housing`.`invoice` (`lease_id`, `pay_date`, `pay_method`, `status`, `penalty`, `damage_charge`, `late_fee`, `total`) VALUES ('123', '2015-03-31', 'abc', 'adsf', '1.1', '1.1', '1.1', '2.2');
INSERT INTO `housing`.`student` ( `password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `comment`, `status`, `courses`, `kin_id`) VALUES ('123456', 'jesse', 'xu', 'student', 'male', '9192912112', '92194311', 'AC', 'Raleigh', '29191', '1992-01-22', 'Graduate', 'China', 'Yes', 'NO', 'NO', 'NO', 'CS','1');
INSERT INTO `housing`.`student` ( `password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `comment`, `status`, `courses`, `kin_id`) VALUES ('123456', 'tom', 'liu', 'guest', 'male', '91929112', '921911', 'AC', 'San Jose', '29191', '1992-03-22', 'Guest', 'Chian', 'Yes', 'NO', 'NO', 'NO', 'CS','1');
INSERT INTO `housing`.`staff` (`id`,`password`, `fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('100','admin', 'Jack', 'Zhang', 'afa', 'sa', '2121', '1991-12-12', 'male', 'manager', 'campus');
INSERT INTO `housing`.`staff` (`id`,`password`, `fname`, `lname`, `addr`, `city`, `post_code`, `birth_date`, `gender`, `position`, `work_at`) VALUES ('101','admin', 'Rose', 'LI', 'AF', 'FAE', '21212', '1992-1-12', 'female', 'TA', 'campus');
INSERT INTO `housing`.`ticket` (`type`, `student_id`, `date`, `location`, `status`, `description`) VALUES ('dsa', '1', '2015-2-1', 'fefe', 'efa', 'afa');
INSERT INTO `housing`.`ticket` (`type`, `student_id`, `date`, `location`, `status`, `description`) VALUES ('fads', '2', '2013-10-12', 'er', 'q', 'fad');
INSERT INTO `housing`.`ticket` (`type`, `student_id`, `date`, `location`, `status`, `description`) VALUES ('312', '1', '2013-12-22', '32', '3fda', 'fdsa');

INSERT INTO `housing`.`student` (`password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `comment`, `status`, `courses`, `kin_id`) VALUES ('123456', 'Jesse', 'Xu', 'student', 'male', '99399129', '912912931', 'RE', 'EF', '20032', '1992-01-14', 'Graduate', 'China', 'no', 'no', 'no', 'no', 'cs', '2');
INSERT INTO `housing`.`student` (`password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `comment`, `status`, `courses`, `kin_id`) VALUES ('123456', 'Tom ', 'SS', 'student', 'male', '121319912', '129319', 'fa', '23', '2919129', '1991-12-12', 'undergraduate', 'USA', 'No', 'no', 'no', 'no', 'ee', '1');
INSERT INTO `housing`.`guest` (`password`, `fname`, `lname`, `type`, `gender`, `tel`, `alter_tel`, `addr`, `city`, `post_code`, `birth_date`, `category`, `nation`, `smoker`, `need`, `comment`, `status`, `courses`) VALUES ('guest', 'Hua', 'YL', 'guest', 'male', '2131234', '32199112', 'fa', 'faj', '29392', '1943-12-13', 'guest', 'china', 'yes', 'no', 'no', 'no', 'cs');


INSERT INTO `housing`.`family_apartment` (`name`, `addr`, `tel`, `room_count`, `bath_count`, `month_rate`) VALUES ('wolf', 'jfjslk', '3891898', '3', '3', '399');
INSERT INTO `housing`.`family_apartment` (`name`, `addr`, `tel`, `room_count`, `bath_count`, `month_rate`) VALUES ('line', 'jfj', '398983', '4', '4', '599');
INSERT INTO `housing`.`general_apartment` (`name`, `addr`, `tel`, `room_count`, `bath_count`) VALUES ('abc', 'fjak', '384891', '3', '3');
INSERT INTO `housing`.`general_apartment` (`name`, `addr`, `tel`, `room_count`, `bath_count`) VALUES ('uie', 'jfj', '399101', '4', '3');
INSERT INTO `housing`.`residence_hall` (`name`, `addr`, `tel`, `manager_id`) VALUES ('denail', 'ejkj', '399291', '1');
INSERT INTO `housing`.`residence_hall` (`name`, `addr`, `tel`, `manager_id`) VALUES ('deenn', 'fjak', '92919', '2');
