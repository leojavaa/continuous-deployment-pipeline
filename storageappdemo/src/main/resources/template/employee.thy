<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Storage demo</title>
    <style>
    .row {
            display: grid;
            place-items: center; /* This centers both horizontally and vertically */
            height: 20px; /* Set the height of the row */
            background-color: lightgray; /* Just for visibility */
        }
    .logo {
            width: 1cm;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f4f4f4;
        }
        .table-container {
            margin-top: 20px;
        }
    </style>
</head>
<body>
<div class="logo-container">
        <img class="logo" th:src="@{/images/company-logo.png}">
    </div>
    <h1>Welcome to CI/CD demo!</h1>
    
    <body>
    <h1>Employee Details</h1>

    <div class="table-container">
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Department</th>
                    <th>Salary</th>
                    <th>Hire Date</th>
                    <th>Status</th>
                    <th>Manager ID</th>
                    <th>Date of Birth</th>
                    <th>Phone Number</th>
                    <th>Address</th>
                    <th>Gender</th>
                    <th>Nationality</th>
                    <th>Bonus Percentage</th>
                </tr>
            </thead>
            <tbody>
                <tr th:each="employee : ${em}">
                    <td th:text="${employee.id}"></td>
                    <td th:text="${employee.firstName}"></td>
                    <td th:text="${employee.lastName}"></td>
                    <td th:text="${employee.email}"></td>
                    <td th:text="${employee.department}"></td>
                    <td th:text="${employee.salary}"></td>
                    <td th:text="${#dates.format(employee.hireDate, 'yyyy-MM-dd')}"></td>
                    <td th:text="${employee.status}"></td>
                    <td th:text="${employee.managerId}"></td>
                    <td th:text="${#dates.format(employee.dob, 'yyyy-MM-dd')}"></td>
                    <td th:text="${employee.phoneNumber}"></td>
                    <td th:text="${employee.address}"></td>
                    <td th:text="${employee.gender}"></td>
                    <td th:text="${employee.nationality}"></td>
                    <td th:text="${employee.bonusPercentage}"></td>
                </tr>
            </tbody>
        </table>
    </div>
    
    
</body>
</html>
