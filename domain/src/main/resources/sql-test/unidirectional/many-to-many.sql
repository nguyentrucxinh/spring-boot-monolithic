-- member
INSERT INTO `spring-monolithic`.`member`
(id, name)
VALUES(0, 'Member 1');

-- club
INSERT INTO `spring-monolithic`.club
(id, name)
VALUES(0, 'Club 1');

-- member_club
INSERT INTO `spring-monolithic`.member_club
(member_id, club_id)
VALUES(1, 1);
