package com.github.brunodles.githubpopular.api.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bruno on 29/10/16.
 */
public class Repository {
    public Long id;
    public String name;
    public String full_name;
    public UserShort owner;
    @SerializedName("private")
    public Boolean isPrivate;
    public String html_url;
    public String description;
    public Boolean fork;
    public String url;
    public String forks_url;
    public String keys_url;
    public String collaborators_url;
    public String teams_url;
    public String hooks_url;
    public String issue_events_url;
    public String events_url;
    public String assignees_url;
    public String branches_url;
    public String tags_url;
    public String blobs_url;
    public String git_tags_url;
    public String git_refs_url;
    public String trees_url;
    public String statuses_url;
    public String languages_url;
    public String stargazers_url;
    public String contributors_url;
    public String subscribers_url;
    public String subscription_url;
    public String commits_url;
    public String git_commits_url;
    public String comments_url;
    public String issue_comment_url;
    public String contents_url;
    public String compare_url;
    public String merges_url;
    public String archive_url;
    public String downloads_url;
    public String issues_url;
    public String pulls_url;
    public String milestones_url;
    public String notifications_url;
    public String labels_url;
    public String releases_url;
    public String deployments_url;
    public String created_at;
    public String updated_at;
    public String pushed_at;
    public String git_url;
    public String ssh_url;
    public String clone_url;
    public String svn_url;
    public String homepage;
    public Long size;
    public Long stargazers_count;
    public Long watchers_count;
    public String language;
    public Boolean has_issues;
    public Boolean has_downloads;
    public Boolean has_wiki;
    public Boolean has_pages;
    public Long forks_count;
    //        public Mirror_url mirror_url;
    public Long open_issues_count;
    public Long forks;
    public Long open_issues;
    public Long watchers;
    public String default_branch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Repository that = (Repository) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
