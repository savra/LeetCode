--difficulty=EASY;name=Game Play Analysis I;url=https://leetcode.com/problems/game-play-analysis-i
select player_id as "player_id", to_char(min(event_date), 'yyyy-mm-dd') as "first_login" from activity
group by player_id;