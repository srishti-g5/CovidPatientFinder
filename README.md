

# COVID Patient Finder

The COVID Patient Finder project is a Java-based Hospital Management System that aids in managing COVID-related patient information. The system includes interfaces for administrators, operators, and users to handle various tasks within a healthcare environment.

## Project Structure

- **src**
  - `Admin.java`
  - `DoctorDetail.java`
  - `HospitalDetail.java`
  - `Operator.java`
  - `Operator1.java`
  - `Patient.java`
  - `Patient1.java`
  - `Request.java`
  - `User.java`
  - ...
- **hibernate**
  - `Admin.hbm.xml`
  - `DoctorDetail.hbm.xml`
  - `HospitalDetail.hbm.xml`
  - `Operator.hbm.xml`
  - `Operator1.hbm.xml`
  - `Patient.hbm.xml`
  - `Request.hbm.xml`
  - `User.hbm.xml`
  - `hibernate.cfg.xml`
- **forms**
  - `About.form`
  - `AdminWindow.form`
  - `CheckLogin.java`
  - `Client.form`
  - `Form.form`
  - `InsertPatient.form`
  - `LoginWindow.form`
  - `OperatorWindow.form`
  - `UpdateDoctor.form`
  - `UpdatePatient.form`
  - `UpdatePatient2.form`
  - `User.form`
  - `UserWindow.form`
- **build**
  - `classes`
  - `nbproject`
- `build.xml`
- `manifest.mf`

## Components

### 1. Admin

- `Admin.java` and `AdminWindow.form` represent the Admin interface for managing COVID patient-related data.

### 2. Operator

- `Operator.java` and `OperatorWindow.form` provide the Operator interface for handling operations related to COVID patients.

### 3. User

- `User.java` and `UserWindow.form` form the User interface for accessing COVID patient-related information.

### 4. Database Configuration (MySQL)

- Update the Hibernate configuration in `hibernate.cfg.xml` to point to your MySQL database. Adjust the `hibernate.connection.url`, `hibernate.connection.username`, and `hibernate.connection.password` properties accordingly.

  
- Make sure to have the MySQL JDBC driver in your classpath.


