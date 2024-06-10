--SQL Assignment 1
use sakila
show tables
#1
select * from film where rental_duration < 5
#2~
select * from customer_ where city = "San Diego"
#3
select * from film where rating = "PG-13" order by title
#4
select * from actor_info where last_name like "A%" order by first_name 
#5
select * from film where release_year = "2006" 
#6
select * from customer where first_name = "john" order by last_name desc
#7
select * from film where rental_rate between 2.99 and 4.99
#8
select * from actor where last_name like "%son" order by last_name
#9~
select * from store where city = "Los Angeles" order by store_id
#10
select * from film where replacement_cost > 20 order by replacement_cost
#11
select * from film where length > 120
#12
select * from customer where active = "1"
#13
select * from film where rental_rate = "0.99" order by length desc
#14
select * from actor where first_name like "%Tom" order by last_name
#15
select * from film where replacement_cost < 15 order by title 
#16
select * from actor where last_name like "%son"
#17
select * from film where rating = "R" order by rental_duration
#18
select * from actor where last_name = "Smith" order by first_name
#19
select * from film where rental_duration = 7 order by replacement_cost
#20
select * from customer where first_name like "%A" order by last_name
#21
select * from film where rental_duration between 3 and 7 and rental_rate > 2.99
#22~
select * from customer where address_id in (select address_id from address where city_id in (select city_id from city_id where city = 'New York' or 'Los Angeles':))
#23
select * from where (rating = 'PG' OR rating = 'G') and length < 90;
#24
select * from actor where first_name like "%Sam" or last_name like "B%" order by first_name, last_name
#25
select * from film where replacement_cost between 15 and 25 order by 
#26~
select * from customer where active = 1
and customer_id in (
    select customer_id
    from rental
    where rental_date >= date_sub(CURDATE(), interval 1 month)
)


#27
select * from film where rental_rate in ("4.99","3.99","2.99")
#28
select * from actor where first_name like "M%" and last_name like "%y"
#29
select * from film where release_year in ("2005", "2006", "2007") order by release_year
#30
select * from where first_name = 'Emily' or last_name like '%Lee%';