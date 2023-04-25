package classes;

import javax.persistence.*;
@Entity
@Table(name = "employees")
public class Employeer {
        private static final String DELETE_STAFF = "DELETE FROM STAFF WHERE id = ?;";
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "middle_name")
        private String middleName;

        @Column(name = "position")
        private String position;

        @Column(name = "department")
        private String department;

        @Column(name = "salary")
        private int salary;


    public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employeer{" +
                    "firstName='" + firstName + '\'' +
                    ", secondName='" + lastName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", position='" + position + '\'' +
                    ", department='" + department + '\'' +
                    ", salary='" + salary + '\'' +
                    '}';
        }
    }

