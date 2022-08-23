insert into role (id, role_name)
    values (1, 'ADMIN'), (2, 'USER');

insert into permission (id, name)
    values (1, 'WRITE'), (2, 'READ');

insert into role_permissions(role_id, permissions_id)
    values (1, 1), (1, 2), (2, 2);

insert into usr (id, email, password, status, username, role_id)
    values (1, 'admin@admin.com', '$2y$12$9n/wxOI.wngFsZds5t8MiOpUHoULqDoVAIYNqHuTUBWBLZ75Ws3UO
', 'ACTIVE', 'admin', 1),
        (2, 'user@user.com', '$2y$12$z/4vSLwsC9V/MZU7AIlwS.hHiuaQwuluKJMrYWiHgu4G5fcX7l90O', 'ACTIVE', 'USER', 2)