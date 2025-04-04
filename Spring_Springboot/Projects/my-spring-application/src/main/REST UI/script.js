const fetchUrl = 'http://localhost:8080/api/student/fetch';
const addUrl = 'http://localhost:8080/api/student/add';

async function fetchStudents() {
    try {
        const res = await fetch(fetchUrl);
        const data = await res.json();

        const tbody = document.querySelector("#studentsTable tbody");
        tbody.innerHTML = '';

        data.forEach(student => {
            tbody.innerHTML += `
        <tr>
          <td>${student.studentId}</td>
          <td>${student.firstName}</td>
          <td>${student.lastName}</td>
          <td>${student.age}</td>
          <td>${student.grade}</td>
        </tr>
      `;
        });
    } catch (error) {
        console.error("Error fetching students:", error);
    }
}
async function addStudent() {
    const studentId = document.getElementById('student_id').value;
    const firstName = document.getElementById('first_name').value;
    const lastName = document.getElementById('last_name').value;
    const age = document.getElementById('age').value;
    const grade = document.getElementById('grade').value;

    const studentData = {
        studentId: studentId,
        firstName: firstName,
        lastName: lastName,
        age: parseInt(age),
        grade: grade
    };

    const messageBox = document.getElementById("statusMessage");

    try {
        // ✅ Store the response first
        const response = await fetch(addUrl, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(studentData)
        });

        // ✅ Then parse it
        const result = await response.json();

        if (result.status && result.status.toLowerCase() === "failed") {
            messageBox.innerHTML = `<p style="color: red;">${result.message}</p>`;
            return;
        }

        messageBox.innerHTML = `<p style="color: green;">${result.message || "Student added successfully!"}</p>`;

        // Clear input fields
        document.getElementById('student_id').value = '';
        document.getElementById('first_name').value = '';
        document.getElementById('last_name').value = '';
        document.getElementById('age').value = '';
        document.getElementById('grade').value = '';

        // Refresh student list
        fetchStudents();
    } catch (error) {
        console.error("Error adding student:", error);
        messageBox.innerHTML = `<p style="color: red;">Unexpected error occurred.</p>`;
    }
}

// Auto-fetch students on page load
// window.onload = fetchStudents;