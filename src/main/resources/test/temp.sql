insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-23 00:00:00', now());

insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-23 00:00:00', now());

insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-24 00:00:00', now());

insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-24 00:00:00', now());

insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-24 00:00:00', now());

insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-25 00:00:00', now());

insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-25 00:00:00', now());

insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-25 00:00:00', now());

insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-25 00:00:00', now());

insert INTO community_feed.community_user
(follower_count, following_count, name, reg_dt, upd_dt)
values (0, 0, 'test', '2024-08-25 00:00:00', now());


select DATE(reg_dt) as date, COUNT(*) from community_user
group by DATE(reg_dt)
ORDER BY date
;

CREATE INDEX community_user_reg_dt_IDX USING BTREE ON community_feed.community_user (reg_dt);

ALTER TABLE community_feed.community_user ADD reg_date DATE NULL;

UPDATE community_feed.community_user SET reg_date = DATE(reg_dt) WHERE 1=1;

ALTER TABLE community_feed.community_user DROP INDEX community_user_reg_dt_IDX;

CREATE INDEX community_user_reg_date_IDX USING BTREE ON community_feed.community_user (reg_date);

