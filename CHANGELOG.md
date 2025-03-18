# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## [2025.02.20]

### Added

-Added three component designs for brainstorming:
-could Resource Manager
-Distrubuted Task Queue
-Cloud Storage API
-Defined kernel methods and secondary methods for each component.
-Addressed additional considerations, including mutability, reliance on internal classes, use of enums/constants, and implementation of secondary methods using kernel methods.

### changed & fixes

-Clarified Method Names & Formatting:
Adjusted method names for consistency (e.g.nqueueTask(Task task) → enqueueTask(Task task)).

## 2025.02.28

### Added

- Designed a proof of concept for Distributed Task Queue component

### Updated

- Changed design to include  task priority handling.
- Improved queue management by adding a `peekNextTask` method.
- Added detailed console logs for better debugging.


