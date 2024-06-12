 create database ourDB;
 use ourDB;
 show tables;
 create table studentdetails
 (
 RollNo char(4),
 Name char (10),
 Address varChar(25),
 City varchar(25)
 );
 select * from studentdetails;
#insert into studentdetails values('1001','abc','tapovan','xyz');
#insert into studentdetails (rollno,name,city) values('1002','xyz','abc');
INSERT INTO studentdetails (RollNo, Name, Address, City) VALUES ('1001', 'John Doe', '123 Main St', 'New');
INSERT INTO studentdetails (RollNo, Name, Address, City) VALUES ('1002', 'Jane Smith', '456 Maple Ave', 'Los');
INSERT INTO studentdetails (RollNo, Name, Address, City) VALUES ('1003', 'Mike Brown', '789 Oak Dr', 'cago');
INSERT INTO studentdetails (RollNo, Name, Address, City) VALUES ('1004', 'Lisa White', '321 Pine Ln', 'ton');

desc studentdetails;
create table markdetails
(
RollNo char(4),
phy int,
chem int,
maths int
);
INSERT INTO markdetails (RollNo, phy, chem, maths) VALUES ('1001', 85, 90, 80);
INSERT INTO markdetails (RollNo, phy, chem, maths) VALUES ('1002', 78, 85, 88);
INSERT INTO markdetails (RollNo, phy, chem, maths) VALUES ('1003', 92, 81, 76);
INSERT INTO markdetails (RollNo, phy, chem, maths) VALUES ('1004', 75, 89, 84);
show tables;
select * from markdetails;

#addin new field to table
alter table studentdetails add contactNum char(10);
select * from studentdetails;
update studentdetails set contactnum = '1234567890';

#Removing column
alter table studentdetails drop contactnum;
select * from studentdetails;

#modify
alter table studentdetails modify address varchar(50);
desc studentdetails;

#aggrigate function
select * from markdetails;
select sum(phy),avg(phy) from markdetails;
select count(city) from studentdetails;
select count(distinct city) from studentdetails;
