--difficulty=EASY;name=Patients With a Condition;url=https://leetcode.com/problems/patients-with-a-condition
SELECT patient_id, patient_name, conditions
FROM (SELECT patient_id,
             patient_name,
             conditions,
             regexp_substr(conditions, '^DIAB1| DIAB1') isDiabetic
      FROM Patients)
WHERE isDiabetic IS NOT NULL