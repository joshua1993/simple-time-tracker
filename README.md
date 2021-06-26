# Simple Time Tracker

## Frontend
To run the frontend application open up a terminal instance and move to TimeTrackerFrontend folder from there run `npm install`.
After you installed all node_modules you can run the frontend application with `ng serve`.

## Backend
To run the backend application run the maven `package` lifecycle from your IDE.
The backend needs mysql database that is manually setup with the following configurations:
```
name: time_tracker_db
user: timetracker
password: password
```