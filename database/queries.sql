select * from users;

insert into orders (id_user,status,subtotal, tax, shipping, total, created_at)
values(1, 'PENDING', 1.1, 2.2,3.3, 6.7,NOW());

select * from orders;