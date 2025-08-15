📝 Task Manager (Console Version)

A simple menu-driven Java console application to manage tasks with deadlines, priority, and status — all stored in memory. Perfect for learning Java Collections, Enums, Comparators, and basic input validation.

🚀 Features

Add Task – Create a new task with unique title, deadline, priority, and status.

Update Task – Modify title, priority, deadline, or status of an existing task.

Delete Task – Remove a task by its ID.

List All Tasks – Sorted by:

Nearest deadline first

Then by priority (HIGH > MEDIUM > LOW)

Search Task – Find tasks by title keyword.

📋 Task Details

Each task contains:

ID (integer, auto-generated or user-provided)

Title (unique, non-empty)

Priority – HIGH, MEDIUM, or LOW (enum)

Deadline – date in yyyy-MM-dd format

Status – PENDING, IN_PROGRESS, or COMPLETED (enum)

🛠 Tech Used

Java Collections (List, Map)

Enums for Priority & Status

Custom Comparator for sorting

Scanner for console input

Date validation using LocalDate

✅ Input Validation

Ensures date is in correct format (yyyy-MM-dd).

Restricts priority and status to predefined enum values.

Avoids duplicate titles.

Keeps asking until valid input is entered.
