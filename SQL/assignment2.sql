#aggrigate function
use sakila;
#1Find the total number of films in the database.
select count(*) from film;
#2
select avg(rental_rate) from film;
#3
select count(*) from rental;
show tables;
#4
select max(replacement_cost) from film;
#5
select sum(amount) from payment;
#6
select avg(length) from film;
#7
select min(rental_duration) from film;
#8
select count(distinct customer_id) from customer;
#9
select avg(amount) from payment;
#10
select count(*) from inventory;
#11~
select count(distinct film_id);
#12
select max(amount) from payment;
#13
select avg(length) from film where rating ='PG';
#14
select * from payment;
select count(payment_id) from payment where date(payment_date) between '2005-05-01' and '2005-05-31';
select count(payment_id) from payment where payment_date between '2005-05-01' and '2005-05-31';
select date(payment_date) from payment;
select payment_date from payment;
select * from where  
#15
select count(*) from film where rental_duration ='7';
#16
select avg(replacement_cost) from film where rental_rate ='2.99';