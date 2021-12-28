package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Peter", Gender.MALE),
                new Person("Sarah", Gender.FEMALE),
                new Person("Max", Gender.MALE),
                new Person("Nadine", Gender.FEMALE),
                new Person("Rod", Gender.MALE),
                new Person("Mariam", Gender.FEMALE)
        );

        people.stream()
                .filter(person -> Gender.MALE.equals(person.gender))
                .forEach(System.out ::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,FEMALE
    }
}
