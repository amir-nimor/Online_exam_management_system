# Online Examination Management System

A web-based platform for creating, managing, conducting, and evaluating online examinations.

The system is designed for three main user roles: **Administrators, Instructors, and Students**. It provides a complete examination workflow, from user registration and course management to exam creation, student participation, and automated or manual grading.

---

## Project Overview

The goal of this project is to develop a web application that enables educational organizations to create and conduct online examinations.

The platform provides dedicated functionality for each user role:

- Administrators manage users, courses, and enrollments.
- Instructors create and manage exams and questions.
- Students access their courses, take authorized exams, and submit their answers.

The system supports multiple-choice and essay questions, reusable question banks, timed examinations, automatic and manual grading, and answer recovery after temporary connection interruptions.

---

## User Roles

### 1. Administrator

Administrators are responsible for managing the platform.

**Responsibilities:**
- View all registered users and their information.
- Approve newly registered users.
- Edit user information and change user roles.
- Search and filter users by role, first name, and last name.
- Create, view, edit, and delete courses.
- Assign instructors to courses.
- Enroll students in courses.
- View all instructors and students associated with each course.

### 2. Instructor

Instructors manage examinations and questions for their assigned courses.

**Responsibilities:**
- View assigned courses.
- View exams associated with each course.
- Create, edit, and delete exams.
- Add multiple-choice and essay questions.
- Select existing questions from the question bank.
- Create and manage reusable questions.
- Assign scores to questions for each exam.
- Review student submissions.
- Manually grade essay answers.

### 3. Student

Students use the platform to access courses and participate in examinations.

**Responsibilities:**
- View enrolled courses.
- View available examinations.
- Start authorized exams.
- Answer examination questions.
- Navigate between questions.
- Modify answers before submitting the exam.
- Submit examinations before the time limit expires.
- Resume an active exam after a temporary connection interruption.

---

## Core Features

- Role-based access control (RBAC).
- User registration and administrator approval.
- User management and search functionality.
- Course management and enrollment.
- Instructor assignment.
- Exam creation and management.
- Multiple-choice and essay questions.
- Reusable question bank.
- Exam-specific question scoring.
- Timed examinations with countdown timers.
- Automatic grading for multiple-choice questions.
- Manual grading for essay questions.
- Automatic exam submission when time expires.
- Temporary answer preservation.
- Exam recovery after connection interruptions.
- Validation and appropriate error handling.

---

# Functional Requirements

## Phase A — User and Course Management

### 1. User Registration

The application must allow users to register under one of two roles:

- Student
- Instructor

During registration, users must select their desired role.

After successful registration, their account must remain in a **Pending Approval** state until an administrator approves it.

### 2. User Approval and Management

Administrators must have access to a list of all registered users across the platform.

Administrators must be able to:

- View registered users and their information.
- Approve newly registered accounts.
- Change account status to Approved.
- Edit user information.
- Change user roles.

### 3. User Search and Filtering

Administrators must be able to search and filter users using different criteria, including:

- User role (Student or Instructor).
- First name.
- Last name.
- Other relevant user attributes.

The system must display all users matching the selected criteria.

### 4. Course Management

Administrators must be able to view all existing courses and create new ones.

Each course must contain at least the following information:

- Course title.
- Unique course identifier.
- Course start date.
- Course end date.

The system must also support editing and deleting courses.

### 5. Instructor Assignment and Student Enrollment

Each course can have only **one assigned instructor**.

An instructor must first register in the system and then be assigned to a course by an administrator.

However, an instructor may teach multiple courses.

Administrators must also be able to enroll students in specific courses.

The system must support editing and removing course assignments and student enrollments.

Administrators must be able to view the complete list of instructors and students associated with each course on a separate page.

---

## Phase B — Exam Management

### 1. Viewing Assigned Courses

After authentication, instructors must be able to view all courses assigned to them by administrators.

After selecting a course, they must be able to view the examinations associated with that course.

### 2. Creating and Managing Exams

For each course, instructors must be able to:

- View previously created examinations.
- Edit existing examinations.
- Delete examinations.
- Create new examinations.

Each examination must contain:

- **Title:** The examination title.
- **Description:** A description of the examination.
- **Duration:** The examination time limit, specified in minutes.

After successfully creating an examination, the course's examination list must be updated.

---

## Phase C — Question Management

### 1. Adding Questions to an Exam

When editing an examination, instructors must be able to add questions in two different ways:

**Option 1: Select from the Question Bank**

Instructors can view previously created questions and select one or more questions to add to the current examination.

**Option 2: Create a New Question**

Instructors can create a new question directly for the current examination.

### 2. Supported Question Types

The application must initially support two question types.

#### Multiple-Choice Questions

- Instructors can add an unlimited number of answer options.
- There must be no predefined limit on the number of options.
- The correct answer must be identified by the instructor.
- The number of options must remain flexible.

#### Essay Questions

- Instructors provide the question text.
- Students receive a text input area to submit their written answers.

### 3. Question Information and Management

Every question must have a short and mandatory title in addition to its question text.

The title helps instructors identify questions more easily in the question bank and during the grading process.

Every newly created question must automatically be added to the instructor's question bank for the relevant course.

Instructors must also be able to edit existing questions.

### 4. Extensible Question Architecture

The question management system must be designed to support new question types in the future without affecting unrelated parts of the application.

The implementation must follow software engineering best practices, particularly the **SOLID principles**.

### 5. Question Bank

Each course must have a question bank containing all questions created by its instructor.

Whenever a new question is created for an examination, it must automatically become available in the question bank of the same course.

These questions can then be reused in other examinations belonging to that course.

### 6. Exam-Specific Question Scoring

Instructors must be able to assign a default score to every question included in an examination.

The system must calculate and display the total score of all questions.

This total represents the maximum possible score for the examination.

**Important:** A question's score must belong to its association with a particular examination, not to the question itself.

The same question may be reused in multiple examinations with different scores.

Therefore, question scores must be managed independently for each examination.

---

## Phase D — Student Examination Experience

### 1. Viewing Enrolled Courses and Available Exams

After authentication, students must be able to view all courses in which they have been enrolled by an administrator.

After entering a course, students must see the examinations they are authorized to take.

By selecting **Start Exam**, the examination must begin immediately.

A student who has already participated in an examination must not be allowed to take it again.

### 2. Taking an Examination

When an examination starts:

- A countdown timer must display the remaining time.
- Examination questions must be displayed to the student.
- Students must be able to navigate to the next question.
- Students must be able to return to previous questions.
- Students must be able to modify their answers while the examination is active.
- The examination can be completed by selecting the Submit button.

### 3. Automatic Exam Submission

When the examination time limit expires, the system must automatically terminate the examination.

Only answers actually provided by the student must be recorded as answered.

Unanswered questions must be marked as unanswered and receive zero points.

**Negative marking is not supported.**

### 4. Handling Connection Interruptions

The application must handle unexpected connection interruptions during an examination.

Answers submitted by students must be temporarily saved so that they can continue their examination after reconnecting.

Students must be allowed to resume an examination only if its original time limit has not expired.

If the examination time expires while a student is disconnected, the student must not be allowed to continue the examination.

---

## Phase E — Exam Evaluation and Grading

### 1. Viewing Exam Participants and Results

Instructors must be able to refresh their examination page and view:

- The total number of participating students.
- The names of participating students.
- The results of students whose examinations have been completed.

### 2. Automatic Grading

Multiple-choice questions must be graded automatically when an examination is completed.

The system must calculate the student's score based on the correct answers and the scores assigned to the questions in that particular examination.

### 3. Manual Grading of Essay Questions

For essay questions, instructors must be able to open an individual student's submitted examination and manually assign a score to each written answer.

The score assigned to an essay answer must never exceed the maximum score defined for that question in the relevant examination.

---

# Business Rules

The following business rules must be enforced throughout the application:

1. Newly registered students and instructors require administrator approval.
2. Each course can have only one assigned instructor.
3. An instructor may teach multiple courses.
4. Only enrolled students can access the examinations of their courses.
5. Each student can participate in an examination only once.
6. Examinations must automatically terminate when their time limit expires.
7. Students can modify their answers while an examination is active.
8. Unanswered questions receive zero points.
9. Negative marking is not supported.
10. Answers must be temporarily preserved during connection interruptions.
11. Questions can be reused across multiple examinations within the same course.
12. Question scores are specific to each examination.
13. Essay scores cannot exceed their corresponding maximum question scores.

---

# Technical Requirements

The original project specification defines the following technical requirements:

| Component | Technology |
|---|---|
| Programming Language | Java |
| Backend Framework | Spring |
| Database | H2 (optional) |
| Frontend | No specific restrictions |

Additional implementation requirements:

- Appropriate and accurate error responses must be provided for each service.
- Authentication failures must return the corresponding HTTP error status.
- The application must handle invalid requests and unauthorized access properly.

---

# Optional Enhancements

The following features are considered additional advantages and may earn extra credit:

### 1. Question Images

Support uploading and attaching images to examination questions.

### 2. Rich Text Editor

Integrate a rich text editor that supports:

- Persian language.
- Right-to-left (RTL) text direction.
- Left-to-right (LTR) text direction.

### 3. Additional Features

Implement useful and practical features that improve the application's functionality and user experience.

### 4. Internationalization and Localization (i18n)

Support internationalization and localization techniques to make the application adaptable to different languages and regions.

---

# Project Objective

The ultimate goal is to develop a maintainable, secure, and extensible online examination management platform.

The application aims to cover the complete examination lifecycle, including user registration, course administration, examination creation, question management, student participation, answer preservation, and accurate grading.

The system should follow clean software architecture principles, maintain a clear separation of responsibilities, and provide flexibility for future improvements and additional features.

---

**Project:** Online Examination Management System  
**Program:** Maktab Sharif — Java 146  
**Project Type:** Final Project  
**Primary Language:** Java  
**Backend Framework:** Spring

