delimiter //

create procedure pc_get_producer_by_name(filter_name varchar(100))

begin
	select *
	from producer p
	where p.name like CONCAT('%', filter_name, '%');
end//

delimiter ;
