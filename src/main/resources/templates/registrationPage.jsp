<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Registration</h1>
    <form action="/register" method="POST">
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="mobileNo">Mobile No:</label>
        <input type="text" id="mobileNo" name="mobileNo" required><br>

        <label for="email">Email Id:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="photo">Photo Upload:</label>
        <input type="file" id="photo" name="photo"><br>

        <label for="fresherOrExperience">Fresher or Experience:</label>
        <input type="radio" id="fresher" name="fresherOrExperience" value="Fresher" required>
        <label for="fresher">Fresher</label>
        <input type="radio" id="experience" name="fresherOrExperience" value="Experience" required>
        <label for="experience">Experience</label><br>

        <!-- Additional fields for experience employees -->
        <label for="employeeId">Employee ID:</label>
        <input type="text" id="employeeId" name="employeeId"><br>

        <label for="employeeName">Employee Name:</label>
        <input type="text" id="employeeName" name="employeeName"><br>

        <label for="gender">Gender:</label>
        <input type="text" id="gender" name="gender"><br>

        <label for="designation">Designation:</label>
        <input type="text" id="designation" name="designation"><br>

        <!-- Add more fields as needed -->

        <input type="submit" value="Register">
    </form>
</body>
</html>
