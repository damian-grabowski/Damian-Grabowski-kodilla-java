package com.kodilla.testing.forum;

import com.kodilla.testing.forum.statistics.Statistics;

public class ForumStatistics {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postsAvgPerUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostsAvgPerUser() {
        return postsAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getGetCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        postsAvgPerUser = calculatePostsAvgPerUser();
        commentsAvgPerUser = calculateCommentsAvgPerUser();
        commentsAvgPerPost = calculateCommentsAvgPerPost();
    }

    private double calculatePostsAvgPerUser() {

        if(usersQuantity>0){
            return (double)postsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerUser() {
        if(usersQuantity>0){
            return (double)commentsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerPost() {
        if(postsQuantity>0){
            return (double)commentsQuantity/postsQuantity;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Forum advanced statistics:");
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Posts average per user" + postsAvgPerUser);
        System.out.println("Comments average per user" + commentsAvgPerUser);
        System.out.println("Comments average per post" + commentsAvgPerPost);
    }
}
