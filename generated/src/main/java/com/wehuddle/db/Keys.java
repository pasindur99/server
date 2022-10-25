/*
 * This file is generated by jOOQ.
 */
package com.wehuddle.db;


import com.wehuddle.db.tables.Answer;
import com.wehuddle.db.tables.Badge;
import com.wehuddle.db.tables.BadgeAchievement;
import com.wehuddle.db.tables.FeedEvent;
import com.wehuddle.db.tables.FlywaySchemaHistory;
import com.wehuddle.db.tables.Issue;
import com.wehuddle.db.tables.IssueAssignment;
import com.wehuddle.db.tables.Notification;
import com.wehuddle.db.tables.Profile;
import com.wehuddle.db.tables.PullRequest;
import com.wehuddle.db.tables.Session;
import com.wehuddle.db.tables.Sprint;
import com.wehuddle.db.tables.SprintIssue;
import com.wehuddle.db.tables.Task;
import com.wehuddle.db.tables.UserFollower;
import com.wehuddle.db.tables.records.AnswerRecord;
import com.wehuddle.db.tables.records.BadgeAchievementRecord;
import com.wehuddle.db.tables.records.BadgeRecord;
import com.wehuddle.db.tables.records.FeedEventRecord;
import com.wehuddle.db.tables.records.FlywaySchemaHistoryRecord;
import com.wehuddle.db.tables.records.IssueAssignmentRecord;
import com.wehuddle.db.tables.records.IssueRecord;
import com.wehuddle.db.tables.records.NotificationRecord;
import com.wehuddle.db.tables.records.ProfileRecord;
import com.wehuddle.db.tables.records.PullRequestRecord;
import com.wehuddle.db.tables.records.SessionRecord;
import com.wehuddle.db.tables.records.SprintIssueRecord;
import com.wehuddle.db.tables.records.SprintRecord;
import com.wehuddle.db.tables.records.TaskRecord;
import com.wehuddle.db.tables.records.UserFollowerRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AnswerRecord> ANSWER_PKEY = Internal.createUniqueKey(Answer.ANSWER, DSL.name("answer_pkey"), new TableField[] { Answer.ANSWER.ID }, true);
    public static final UniqueKey<BadgeRecord> BADGE_PKEY = Internal.createUniqueKey(Badge.BADGE, DSL.name("badge_pkey"), new TableField[] { Badge.BADGE.ID }, true);
    public static final UniqueKey<BadgeAchievementRecord> BADGE_ACHIEVEMENT_PKEY = Internal.createUniqueKey(BadgeAchievement.BADGE_ACHIEVEMENT, DSL.name("badge_achievement_pkey"), new TableField[] { BadgeAchievement.BADGE_ACHIEVEMENT.ID }, true);
    public static final UniqueKey<FeedEventRecord> FEED_EVENT_PKEY = Internal.createUniqueKey(FeedEvent.FEED_EVENT, DSL.name("feed_event_pkey"), new TableField[] { FeedEvent.FEED_EVENT.ID }, true);
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
    public static final UniqueKey<IssueRecord> ISSUE_GITHUB_ISSUE_ID_KEY = Internal.createUniqueKey(Issue.ISSUE, DSL.name("issue_github_issue_id_key"), new TableField[] { Issue.ISSUE.GITHUB_ISSUE_ID }, true);
    public static final UniqueKey<IssueRecord> ISSUE_PKEY = Internal.createUniqueKey(Issue.ISSUE, DSL.name("issue_pkey"), new TableField[] { Issue.ISSUE.ID }, true);
    public static final UniqueKey<IssueAssignmentRecord> ISSUE_ASSIGNMENT_ISSUE_ID_PROFILE_ID_KEY = Internal.createUniqueKey(IssueAssignment.ISSUE_ASSIGNMENT, DSL.name("issue_assignment_issue_id_profile_id_key"), new TableField[] { IssueAssignment.ISSUE_ASSIGNMENT.ISSUE_ID, IssueAssignment.ISSUE_ASSIGNMENT.PROFILE_ID }, true);
    public static final UniqueKey<IssueAssignmentRecord> ISSUE_ASSIGNMENT_PKEY = Internal.createUniqueKey(IssueAssignment.ISSUE_ASSIGNMENT, DSL.name("issue_assignment_pkey"), new TableField[] { IssueAssignment.ISSUE_ASSIGNMENT.ID }, true);
    public static final UniqueKey<NotificationRecord> NOTIFICATION_PKEY = Internal.createUniqueKey(Notification.NOTIFICATION, DSL.name("notification_pkey"), new TableField[] { Notification.NOTIFICATION.ID }, true);
    public static final UniqueKey<ProfileRecord> PROFILE_PKEY = Internal.createUniqueKey(Profile.PROFILE, DSL.name("profile_pkey"), new TableField[] { Profile.PROFILE.ID }, true);
    public static final UniqueKey<PullRequestRecord> PULL_REQUEST_GITHUB_PR_ID_KEY = Internal.createUniqueKey(PullRequest.PULL_REQUEST, DSL.name("pull_request_github_pr_id_key"), new TableField[] { PullRequest.PULL_REQUEST.GITHUB_PR_ID }, true);
    public static final UniqueKey<PullRequestRecord> PULL_REQUEST_PKEY = Internal.createUniqueKey(PullRequest.PULL_REQUEST, DSL.name("pull_request_pkey"), new TableField[] { PullRequest.PULL_REQUEST.ID }, true);
    public static final UniqueKey<SessionRecord> SESSION_PKEY = Internal.createUniqueKey(Session.SESSION, DSL.name("session_pkey"), new TableField[] { Session.SESSION.ID }, true);
    public static final UniqueKey<SprintRecord> SPRINT_PKEY = Internal.createUniqueKey(Sprint.SPRINT, DSL.name("sprint_pkey"), new TableField[] { Sprint.SPRINT.ID }, true);
    public static final UniqueKey<SprintIssueRecord> SPRINT_ISSUE_PKEY = Internal.createUniqueKey(SprintIssue.SPRINT_ISSUE, DSL.name("sprint_issue_pkey"), new TableField[] { SprintIssue.SPRINT_ISSUE.ID }, true);
    public static final UniqueKey<SprintIssueRecord> SPRINT_ISSUE_SPRINT_ID_ISSUE_ID_KEY = Internal.createUniqueKey(SprintIssue.SPRINT_ISSUE, DSL.name("sprint_issue_sprint_id_issue_id_key"), new TableField[] { SprintIssue.SPRINT_ISSUE.SPRINT_ID, SprintIssue.SPRINT_ISSUE.ISSUE_ID }, true);
    public static final UniqueKey<TaskRecord> TASK_PKEY = Internal.createUniqueKey(Task.TASK, DSL.name("task_pkey"), new TableField[] { Task.TASK.ID }, true);
    public static final UniqueKey<TaskRecord> TASK_TITLE_KEY = Internal.createUniqueKey(Task.TASK, DSL.name("task_title_key"), new TableField[] { Task.TASK.TITLE }, true);
    public static final UniqueKey<UserFollowerRecord> USER_FOLLOWER_PKEY = Internal.createUniqueKey(UserFollower.USER_FOLLOWER, DSL.name("user_follower_pkey"), new TableField[] { UserFollower.USER_FOLLOWER.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AnswerRecord, ProfileRecord> ANSWER__ANSWER_PROFILEID_FKEY = Internal.createForeignKey(Answer.ANSWER, DSL.name("answer_profileid_fkey"), new TableField[] { Answer.ANSWER.PROFILEID }, Keys.PROFILE_PKEY, new TableField[] { Profile.PROFILE.ID }, true);
    public static final ForeignKey<AnswerRecord, TaskRecord> ANSWER__ANSWER_TASKID_FKEY = Internal.createForeignKey(Answer.ANSWER, DSL.name("answer_taskid_fkey"), new TableField[] { Answer.ANSWER.TASKID }, Keys.TASK_PKEY, new TableField[] { Task.TASK.ID }, true);
    public static final ForeignKey<BadgeAchievementRecord, BadgeRecord> BADGE_ACHIEVEMENT__BADGE_ACHIEVEMENT_BADGEID_FKEY = Internal.createForeignKey(BadgeAchievement.BADGE_ACHIEVEMENT, DSL.name("badge_achievement_badgeid_fkey"), new TableField[] { BadgeAchievement.BADGE_ACHIEVEMENT.BADGEID }, Keys.BADGE_PKEY, new TableField[] { Badge.BADGE.ID }, true);
    public static final ForeignKey<BadgeAchievementRecord, ProfileRecord> BADGE_ACHIEVEMENT__BADGE_ACHIEVEMENT_PROFILEID_FKEY = Internal.createForeignKey(BadgeAchievement.BADGE_ACHIEVEMENT, DSL.name("badge_achievement_profileid_fkey"), new TableField[] { BadgeAchievement.BADGE_ACHIEVEMENT.PROFILEID }, Keys.PROFILE_PKEY, new TableField[] { Profile.PROFILE.ID }, true);
    public static final ForeignKey<FeedEventRecord, ProfileRecord> FEED_EVENT__FEED_EVENT_PROFILEID_FKEY = Internal.createForeignKey(FeedEvent.FEED_EVENT, DSL.name("feed_event_profileid_fkey"), new TableField[] { FeedEvent.FEED_EVENT.PROFILEID }, Keys.PROFILE_PKEY, new TableField[] { Profile.PROFILE.ID }, true);
    public static final ForeignKey<NotificationRecord, ProfileRecord> NOTIFICATION__NOTIFICATION_PROFILEID_FKEY = Internal.createForeignKey(Notification.NOTIFICATION, DSL.name("notification_profileid_fkey"), new TableField[] { Notification.NOTIFICATION.PROFILEID }, Keys.PROFILE_PKEY, new TableField[] { Profile.PROFILE.ID }, true);
    public static final ForeignKey<PullRequestRecord, ProfileRecord> PULL_REQUEST__PULL_REQUEST_PROFILE_ID_FKEY = Internal.createForeignKey(PullRequest.PULL_REQUEST, DSL.name("pull_request_profile_id_fkey"), new TableField[] { PullRequest.PULL_REQUEST.PROFILE_ID }, Keys.PROFILE_PKEY, new TableField[] { Profile.PROFILE.ID }, true);
    public static final ForeignKey<SessionRecord, ProfileRecord> SESSION__SESSION_PROFILE_ID_FKEY = Internal.createForeignKey(Session.SESSION, DSL.name("session_profile_id_fkey"), new TableField[] { Session.SESSION.PROFILE_ID }, Keys.PROFILE_PKEY, new TableField[] { Profile.PROFILE.ID }, true);
    public static final ForeignKey<SprintIssueRecord, IssueRecord> SPRINT_ISSUE__SPRINT_ISSUE_ISSUE_ID_FKEY = Internal.createForeignKey(SprintIssue.SPRINT_ISSUE, DSL.name("sprint_issue_issue_id_fkey"), new TableField[] { SprintIssue.SPRINT_ISSUE.ISSUE_ID }, Keys.ISSUE_PKEY, new TableField[] { Issue.ISSUE.ID }, true);
    public static final ForeignKey<SprintIssueRecord, SprintRecord> SPRINT_ISSUE__SPRINT_ISSUE_SPRINT_ID_FKEY = Internal.createForeignKey(SprintIssue.SPRINT_ISSUE, DSL.name("sprint_issue_sprint_id_fkey"), new TableField[] { SprintIssue.SPRINT_ISSUE.SPRINT_ID }, Keys.SPRINT_PKEY, new TableField[] { Sprint.SPRINT.ID }, true);
    public static final ForeignKey<UserFollowerRecord, ProfileRecord> USER_FOLLOWER__USER_FOLLOWER_FOLLOWS_FKEY = Internal.createForeignKey(UserFollower.USER_FOLLOWER, DSL.name("user_follower_follows_fkey"), new TableField[] { UserFollower.USER_FOLLOWER.FOLLOWS }, Keys.PROFILE_PKEY, new TableField[] { Profile.PROFILE.ID }, true);
    public static final ForeignKey<UserFollowerRecord, ProfileRecord> USER_FOLLOWER__USER_FOLLOWER_PROFILEID_FKEY = Internal.createForeignKey(UserFollower.USER_FOLLOWER, DSL.name("user_follower_profileid_fkey"), new TableField[] { UserFollower.USER_FOLLOWER.PROFILEID }, Keys.PROFILE_PKEY, new TableField[] { Profile.PROFILE.ID }, true);
}
