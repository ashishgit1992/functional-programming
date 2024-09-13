package chapters;

import java.util.List;

public class chapter01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        //            print all the numbers in list using functional approach
        printAllUsingFunctional(numbers);
        //            print only even numbers
        printOddNumber(numbers);
        //            print only even numbers
        printEvenNumber(numbers);
        //        print list of courses whose name starts with spring
        printCoursesStartWithSpring(courses);
        //        print courses whose name has atleast 4 letters
        printCourseswithAtleast4LetterName(courses);
        //        print square of numbers
        printSquareOfNummbers(numbers);
        //        print cube of numbers
        printCubeOfNummbers(numbers);
        //       print number of characters in each course name
        printNumberOfCharactersInCourseName(courses);

    }


    private static void printAllUsingFunctional(List<Integer> list) {
        list.stream().forEach(System.out::println);
    }

    private static void printEvenNumber(List<Integer> list) {
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }

    private static void printOddNumber(List<Integer> list) {
        list.stream().filter(i -> i % 2 != 0).forEach(System.out::println);
    }

    private static void printCoursesStartWithSpring(List<String> list) {
        list.stream().filter(name -> name.contains("Spring")).forEach(System.out::println);
    }

    private static void printCourseswithAtleast4LetterName(List<String> courses) {
        courses.stream().filter(name -> name.length() >= 4).forEach(System.out::println);
    }

    private static void printSquareOfNummbers(List<Integer> numbers) {
        numbers.stream().map(i -> i * i).forEach(System.out::println);
    }
    private static void printCubeOfNummbers(List<Integer> numbers) {
        numbers.stream().map(i -> i * i*i).forEach(System.out::println);
    }
    private static void printNumberOfCharactersInCourseName(List<String> courses) {
        courses.stream().map(name ->name+"  "+ name.length()).forEach(System.out::println);
    }



}
