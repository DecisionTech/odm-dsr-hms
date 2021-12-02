# Example Healthcare Medical Support Decision Project
## These rules are an IBM Operational Decision Manager project in draft status.

This is a standalone Decision Service project sample to demonstrate using IBM Operational Decision Manager (ODM) for healthcare industry decisions and rules.

Introduction

Healthcare rules
This decision service shows how to leverage business rules for medical decision support.

To import the projects, please follow the instruction of setting up local clients. 
https://hub.jazz.net/docs/reference/gitclient

What is drug interaction?
A drug interaction is a situation in which a substance affects the activity of a drug,
i.e. the effects are increased or decreased, or they produce a new effect that neither 
produces on its own. Typically, interaction between drugs come to mind (drug-drug interaction)
Source: http://en.wikipedia.org/wiki/Drug_interaction

Expected console output for scenario 1 : 
Active medications: 
Coumadin
Recommended drug: Levofloxacin
Recommended dose: 500mg every 24 hours for 14 days
NR lab test for 5 days in future is posted as a laboratory order
List of patient problems:
  - Diabetes
  - Mild liver disease
  - Coumadin and Levofloxacin can result in reduced effectivemess of Coumadin

Software Prerequisites

Requires a local ODM Decision Server installation from ODM Standard or ODM Advanced. 

Version(s) Supported

TBD

License Information

This project is licensed as specified in License.txt
