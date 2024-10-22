package TcsIPA;

import java.util.Arrays;
import java.util.Scanner;

public class courseProgram {

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Course[] courses = new Course[4];

    for(int i=0; i<4; i++){
        int courseId = Integer.parseInt(sc.nextLine());
        String courseName = sc.nextLine();
        String courseAdmin = sc.nextLine();
        int quiz = Integer.parseInt(sc.nextLine());
        int handson = Integer.parseInt(sc.nextLine());

        courses[i] = new Course(courseId, courseName, courseAdmin, quiz, handson);
    }

    String admin = sc.nextLine();
    int givenHandson = Integer.parseInt(sc.nextLine());

    int avgQuiz = findAvgByCourseAdmin(courses, admin);

    if( avgQuiz > 0){
        System.out.println(avgQuiz);
    } else {
        System.out.println("No Course Found!");
    }

    Course[] result = sortByHandson(courses, givenHandson);

    if( result != null){
        for(Course course : result){
            System.out.println(course.getCourseName());
        }
    } else {
        System.out.println("No Course found with mentioned attribute.");
    }

}


    public static int findAvgByCourseAdmin(Course[] courses, String admin){
        int sum = 0, count =0;

        for(Course course : courses){
            if(course.getCourseAdmin().equalsIgnoreCase(admin)){
               sum += course.getQuiz();
               count++;
            }
        }

        if(count!=0){
            sum = sum/count;
        } else {
            sum = 0;
        }
        return sum;
    }

    public static Course[] sortByHandson(Course[] courses, int hand){
        int limit = hand;
        int count = 0;

        for(Course course: courses){
            if(course.getHandson()<limit){
                count= count+1;
            }
        }
        Course[] result =new Course[count];

        int count1 = 0;
        for(int i=0;i<=count;i++){
            if(courses[i].getHandson()<limit){
                result[count1] = courses[i];
                count1++;
            }
        }
        Arrays.sort(result);

        if(result.length>0){
            return result;
        } else {
            return null;
        }
    }
}

class Course implements Comparable<Course>{

    private int courseId, quiz, handson;
    private String courseName, courseAdmin;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId (){ return courseId; }
    public String getCourseName (){ return courseName; }
    public String getCourseAdmin (){ return courseAdmin; }
    public int getQuiz (){ return quiz; }
    public int getHandson (){ return handson;}

    public void setCourseId ( int courseId){ this.courseId = courseId; }
    public void setCourseName ( String courseName){ this.courseName = courseName;}
    public void setCourseAdmin ( String courseAdmin){ this.courseAdmin = courseAdmin;}
    public void setQuiz ( int quiz){ this.quiz = quiz; }
    public void setHandson ( int handson){ this.handson = handson; }

    public int compareTo(Course other){
        return this.handson - other.handson;
    }

}