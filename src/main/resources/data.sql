--password is same as login
insert into clients("LOGIN", "PASSWORD", "WALLET") values
('user', '$2a$04$nlnIdhhsC.MeI4KzJnGAC.4WwIVHxyD2GsnXv6H71NqoNGWB60BBa', 100000),
('user1', '$2a$04$1hvRygXBaUS7IHY3DsXkeuspWcGHQFhseA1X8DcgB5S7yZ81Vjyym', 100000),
('user2', '$2a$04$VSF1PPCYXVOnb8Y3Qawb4OlzmxNVh8J33NWzZDCWbXsKJEKD3/pUq', 200000),
('user3', '$2a$04$4.mBNDfNRwHhkibOHui.be2rV3xE3DZBzuDTi2mlLrQg.bmviugs2', 300000),
('user4', '$2a$04$i.EcLXm.XUapJzBnLT45seRdtIl7ooQqAhlKIHc5CCcLnTJHw9d7e', 400000),
('user5', '$2a$04$jynl8Hyzcq.6nCHL3dXBAuOCnkiFNwQV9TI8ieuInSxF1jcA.H2/u', 500000),
('user6', '$2a$04$jSxBcn/EouZ3m1oVFop8o.Oif.EfphrBn0iE9qteSHroDcbjZZ1k2', 600000),
('user7', '$2a$04$fZLlI4Mon/GtsC/NyJyZ9uB6l5.JAkCjpNH/KctWZoHA6d7GqCNcK', 700000),
('user8', '$2a$04$CBRbO.hbufZeEG0ABb35au6hFLhjvHE02Ryw12ZFQiO5VX21fES5G', 800000),
('user9', '$2a$04$YiAEQ0TYnMS6SjOeG7pbM.n.7S6VFv2Sa08Tx6UVXG8fdl6icqfZm', 900000);

insert into products("NAME", "OWNER", "PRICE", "STOCK", "CREATIONTIME") values
('product', 'owner', 1000, 1, CURRENT_TIMESTAMP),
('product1', 'owner1', 1000, 1, CURRENT_TIMESTAMP),
('product2', 'owner2', 2000, 2, CURRENT_TIMESTAMP),
('product3', 'owner3', 3000, 3, CURRENT_TIMESTAMP),
('product4', 'owner4', 4000, 4, CURRENT_TIMESTAMP),
('product5', 'owner5', 5000, 5, CURRENT_TIMESTAMP),
('product6', 'owner6', 6000, 6, CURRENT_TIMESTAMP),
('product7', 'owner7', 7000, 7, CURRENT_TIMESTAMP),
('product8', 'owner8', 8000, 8, CURRENT_TIMESTAMP),
('product9', 'owner9', 9000, 9, CURRENT_TIMESTAMP);