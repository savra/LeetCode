SELECT patient_id, patient_name, conditions
FROM (SELECT patient_id,
             patient_name,
             conditions,
             regexp_substr(conditions, '^DIAB1| DIAB1') isDiabetic
      FROM Patients)
WHERE isDiabetic IS NOT NULL