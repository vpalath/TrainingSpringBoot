create table politicalparties (id integer generated by default as identity, candidatename varchar(255), partyname varchar(255), symbolpath varchar(255), primary key (id))
create table users (userid integer generated by default as identity, aadhaarid bigint, address varchar(255), age integer, dob timestamp, firstname varchar(255), lastname varchar(255), phone varchar(255), primary key (userid))
create table votedetails (id integer generated by default as identity, aadhaarid bigint, partyid integer, primary key (id))

INSERT INTO users VALUES (1,'ggggg','ffff','2017-01-29',12,'43434554',14,1234);

INSERT INTO users VALUES (1,1234,'14',12,null,'vin','pal','123456');



(2,'g','sathish','1970-01-10',21,'43434554','No 14',13456),(3,'k','murugan','2017-01-29',1,'43434554','No 14',15671);


select users0_.userid as userid1_1_0_, users0_.aadhaarid as aadhaari2_1_0_, users0_.address as address3_1_0_, users0_.age as age4_1_0_, users0_.dob as dob5_1_0_, users0_.firstname as firstnam6_1_0_, users0_.lastname as lastname7_1_0_, users0_.phone as phone8_1_0_ from users users0_ where users0_.userid=?


select * from USERS