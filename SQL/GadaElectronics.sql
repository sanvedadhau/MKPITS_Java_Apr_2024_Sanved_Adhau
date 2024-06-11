create database GadaElectronics;
use GadaElectronics;
create table Inventory
(
Product_id char(4),
Product_Name char(10),
Price char(5),
Quantity char(4)
);
create table Customer
(
Customer_id char(4),
First_Name char(10),
Last_Name char(10),
Address varChar(25),
city char (10),
MoNumber int
);
create table Staff
(
Staff_id char(4),
first_name char(10),
last_name char (10),
address varChar (25),
MoNumber int
);
create table Sales
(
sales_id char(4),
sales_bill_No int,
Product_id char(4),
staff_id char(4),
Quantity int,
customer_id char(4)
);
create table Purchase 
(
purchase_id char(4),
purchase_bill_No int,
Product_id char(4),
Quantity int,
supplier_id char(4)
);
create table suppliers (
supplier_id char(4),
first_name char(10),
last_name char (10),
MoNumber int,
address varChar(25),
city varChar(50)
);


insert into Inventory (Product_id, Product_Name, Price, Quantity) values
('P001', 'TV', '25000', '10'),
('P002', 'Fridge', '15000', '5'),
('P003', 'AC', '30000', '7'),
('P004', 'WashingM', '20000', '4');

insert into Customer (Customer_id, First_Name, Last_Name, Address, City, MoNumber) values
('C001', 'Tipendra', 'Gada', 'Gokuldham', 'Mumbai', 1234567890),
('C002', 'Taarak', 'Mehta', 'Gokuldham', 'Mumbai', 1234567891),
('C003', 'Aatmaram', 'Bhide', 'Gokuldham', 'Mumbai', 1234567892),
('C004', 'Dr.Hansraj', 'Hathi', 'Gokuldham', 'Mumbai', 1234567893),
('C005', 'Babita', 'Iyyer', 'Gokuldham', 'Mumbai', 1234567894);

insert into Staff (Staff_id, First_Name, Last_Name, Address, MoNumber) values
('S001', 'Nattu', 'Kaka', 'Gokuldham', 1234567894),
('S002', 'Bagha', 'Bagha', 'Gokuldham', 1234567895),
('S003', 'Magan', 'Bhai', 'Gokuldham', 1234567896);

insert into Sales (Sales_id, Sales_bill_No, Product_id, Staff_id, Quantity, Customer_id) values
('SA01', 1001, 'P001', 'S001', 1, 'C001'),
('SA02', 1002, 'P002', 'S002', 1, 'C002'),
('SA03', 1003, 'P003', 'S003', 1, 'C003'),
('SA04', 1004, 'P004', 'S001', 1, 'C004');

insert into Purchase (Purchase_id, Purchase_bill_No, Product_id, Quantity, Supplier_id) values
('PU01', 2001, 'P001', 10, 'SP01'),
('PU02', 2002, 'P002', 5, 'SP02'),
('PU03', 2003, 'P003', 7, 'SP03'),
('PU04', 2004, 'P004', 4, 'SP04');

insert into Suppliers (Supplier_id, First_Name, Last_Name, MoNumber, Address, City) values
('SP01', 'Sundar', 'Lal', 98743210, 'Ahmedabad', 'Gujarat'),
('SP02', 'Bakka', 'Patel', 98743211, 'Surat', 'Gujarat'),
('SP03', 'Popatlal', 'Pandey', 98743212, 'Gokuldham', 'Mumbai'),
('SP04', 'Abdul', 'Khan', 98743213, 'Gokuldham', 'Mumbai');

select * from customer;
select * from inventory;
select * from purchase;
select * from sales;
select * from staff;
select * from suppliers;


