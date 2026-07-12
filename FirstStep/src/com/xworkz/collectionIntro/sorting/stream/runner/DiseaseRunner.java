package com.xworkz.collectionIntro.sorting.stream.runner;

import com.xworkz.collectionIntro.sorting.stream.dto.DiseaseDTO;

import java.util.ArrayList;
import java.util.List;

public class DiseaseRunner {
    public static void main(String[] args) {

        List<DiseaseDTO> diseaseDTOS = new ArrayList<>();

        diseaseDTOS.add(new DiseaseDTO(1, "Influenza", "Viral infection affecting respiratory system", "Fever, cough, sore throat", "Virus", "Antiviral drugs", "Rest and fluids", "Vaccine", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(2, "Diabetes", "Chronic metabolic disorder", "Increased thirst, frequent urination", "Insulin deficiency", "Insulin therapy", "Lifestyle management", "Healthy diet", "Metabolic"));
        diseaseDTOS.add(new DiseaseDTO(3, "Hypertension", "High blood pressure condition", "Headaches, shortness of breath", "Genetic factors", "ACE inhibitors", "Medication", "Low sodium diet", "Cardiovascular"));
        diseaseDTOS.add(new DiseaseDTO(4, "Asthma", "Chronic inflammatory airway disease", "Wheezing, chest tightness", "Allergens", "Inhalers", "Bronchodilators", "Avoid triggers", "Respiratory"));
        diseaseDTOS.add(new DiseaseDTO(5, "Arthritis", "Joint inflammation disorder", "Joint pain, stiffness", "Autoimmune", "Anti-inflammatory drugs", "Physical therapy", "Exercise", "Autoimmune"));
        diseaseDTOS.add(new DiseaseDTO(6, "Malaria", "Parasitic disease transmitted by mosquitoes", "Fever, chills, anemia", "Plasmodium parasite", "Antimalarial drugs", "Chloroquine", "Mosquito nets", "Parasitic"));
        diseaseDTOS.add(new DiseaseDTO(7, "Tuberculosis", "Bacterial infection affecting lungs", "Cough, weight loss, fever", "Mycobacterium", "Antibiotics", "Isoniazid", "BCG vaccine", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(8, "Hepatitis B", "Viral infection affecting liver", "Jaundice, fatigue, abdominal pain", "Hepatitis B virus", "Antiviral drugs", "Vaccination", "Safe sex", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(9, "Dengue", "Mosquito-borne viral disease", "High fever, joint pain, rash", "Dengue virus", "Supportive care", "Fluid replacement", "Mosquito control", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(10, "Pneumonia", "Lung infection causing inflammation", "Cough, fever, difficulty breathing", "Bacteria/virus", "Antibiotics", "Oxygen therapy", "Vaccination", "Infectious"));
        diseaseDTOS.add(new DiseaseDTO(11, "Cancer", "Uncontrolled cell growth", "Fatigue, weight loss, pain", "Genetic mutations", "Chemotherapy", "Surgery", "Screening", "Oncological"));
        diseaseDTOS.add(new DiseaseDTO(12, "Alzheimer's", "Neurodegenerative disorder", "Memory loss, confusion", "Brain changes", "Cholinesterase inhibitors", "Supportive care", "Mental exercise", "Neurological"));
        diseaseDTOS.add(new DiseaseDTO(13, "Parkinson's", "Progressive nervous system disorder", "Tremors, stiffness, balance issues", "Dopamine deficiency", "Levodopa", "Physical therapy", "Exercise", "Neurological"));
        diseaseDTOS.add(new DiseaseDTO(14, "Migraine", "Severe headache condition", "Throbbing pain, nausea, sensitivity", "Triggers", "Triptans", "Pain relievers", "Avoid triggers", "Neurological"));
        diseaseDTOS.add(new DiseaseDTO(15, "Depression", "Mental health disorder", "Sadness, loss of interest", "Chemical imbalance", "Antidepressants", "Psychotherapy", "Stress management", "Psychiatric"));
        diseaseDTOS.add(new DiseaseDTO(16, "Anxiety", "Excessive worry and fear", "Restlessness, rapid heartbeat", "Stress", "Anti-anxiety drugs", "CBT therapy", "Relaxation", "Psychiatric"));
        diseaseDTOS.add(new DiseaseDTO(17, "Epilepsy", "Neurological disorder causing seizures", "Seizures, loss of awareness", "Brain abnormalities", "Anticonvulsants", "Medication", "Sleep hygiene", "Neurological"));
        diseaseDTOS.add(new DiseaseDTO(18, "Thyroid", "Thyroid gland disorder", "Weight changes, fatigue", "Hormonal imbalance", "Thyroid medication", "Hormone therapy", "Regular checkups", "Endocrine"));
        diseaseDTOS.add(new DiseaseDTO(19, "Kidney Disease", "Progressive loss of kidney function", "Fatigue, swelling, changes in urine", "Diabetes, hypertension", "Dialysis", "Medication", "Blood pressure control", "Renal"));
        diseaseDTOS.add(new DiseaseDTO(20, "Liver Disease", "Damage to liver function", "Jaundice, abdominal swelling", "Alcohol, viruses", "Medications", "Lifestyle changes", "Avoid alcohol", "Hepatic"));
        diseaseDTOS.add(new DiseaseDTO(21, "Heart Disease", "Cardiovascular system disorder", "Chest pain, shortness of breath", "Atherosclerosis", "Statins", "Surgery", "Healthy diet", "Cardiovascular"));
        diseaseDTOS.add(new DiseaseDTO(22, "Stroke", "Interruption of blood supply to brain", "Paralysis, speech difficulties", "Blood clots", "Clot-busting drugs", "Rehabilitation", "Blood pressure control", "Cerebrovascular"));
        diseaseDTOS.add(new DiseaseDTO(23, "HIV/AIDS", "Viral infection attacking immune system", "Weight loss, infections", "HIV virus", "Antiretroviral therapy", "Medication", "Safe practices", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(24, "COVID-19", "Coronavirus respiratory infection", "Fever, cough, loss of taste", "SARS-CoV-2", "Antiviral drugs", "Supportive care", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(25, "Cholera", "Bacterial infection causing diarrhea", "Severe diarrhea, dehydration", "Vibrio cholerae", "Rehydration", "Antibiotics", "Clean water", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(26, "Typhoid", "Bacterial infection affecting intestines", "Fever, abdominal pain, headache", "Salmonella typhi", "Antibiotics", "Fluid replacement", "Vaccination", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(27, "Measles", "Viral infection causing rash", "Fever, rash, cough", "Measles virus", "Supportive care", "Vitamin A", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(28, "Mumps", "Viral infection affecting salivary glands", "Swollen glands, fever", "Mumps virus", "Supportive care", "Rest", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(29, "Rubella", "Viral infection causing rash", "Rash, fever, joint pain", "Rubella virus", "Supportive care", "Rest", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(30, "Chickenpox", "Viral infection causing itchy rash", "Itchy blisters, fever", "Varicella virus", "Antihistamines", "Calamine lotion", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(31, "Shingles", "Reactivation of chickenpox virus", "Painful rash, blisters", "Varicella virus", "Antiviral drugs", "Pain management", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(32, "Polio", "Viral infection affecting nervous system", "Paralysis, muscle weakness", "Poliovirus", "Supportive care", "Physical therapy", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(33, "Tetanus", "Bacterial infection affecting nervous system", "Muscle spasms, lockjaw", "Clostridium tetani", "Antitoxin", "Antibiotics", "Vaccination", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(34, "Diphtheria", "Bacterial infection affecting throat", "Sore throat, difficulty breathing", "Corynebacterium", "Antibiotics", "Antitoxin", "Vaccination", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(35, "Whooping Cough", "Bacterial infection affecting respiratory system", "Severe coughing fits", "Bordetella pertussis", "Antibiotics", "Supportive care", "Vaccination", "Bacterial"));
        diseaseDTOS.add(new DiseaseDTO(36, "Hepatitis A", "Viral infection affecting liver", "Jaundice, fatigue, nausea", "Hepatitis A virus", "Supportive care", "Rest", "Vaccination", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(37, "Hepatitis C", "Viral infection affecting liver", "Fatigue, liver damage", "Hepatitis C virus", "Antiviral drugs", "Medication", "Safe practices", "Viral"));
        diseaseDTOS.add(new DiseaseDTO(38, "Leukemia", "Cancer of blood-forming tissues", "Fatigue, infections, bleeding", "Genetic mutations", "Chemotherapy", "Stem cell transplant", "Avoid radiation", "Oncological"));
        diseaseDTOS.add(new DiseaseDTO(39, "Lymphoma", "Cancer of lymphatic system", "Swollen lymph nodes, fever", "Genetic factors", "Chemotherapy", "Radiation", "Healthy lifestyle", "Oncological"));
        diseaseDTOS.add(new DiseaseDTO(40, "Melanoma", "Serious type of skin cancer", "Changes in moles, skin lesions", "UV radiation", "Surgery", "Immunotherapy", "Sun protection", "Oncological"));
        diseaseDTOS.add(new DiseaseDTO(41, "Osteoporosis", "Bone density loss condition", "Fractures, back pain", "Aging, hormonal", "Calcium supplements", "Medication", "Exercise", "Skeletal"));
        diseaseDTOS.add(new DiseaseDTO(42, "Gout", "Inflammatory arthritis condition", "Severe joint pain, swelling", "Uric acid buildup", "Anti-inflammatory drugs", "Medication", "Diet changes", "Metabolic"));
        diseaseDTOS.add(new DiseaseDTO(43, "Psoriasis", "Autoimmune skin condition", "Red, scaly skin patches", "Immune system", "Topical treatments", "Phototherapy", "Stress management", "Autoimmune"));
        diseaseDTOS.add(new DiseaseDTO(44, "Eczema", "Chronic skin inflammation", "Itchy, dry skin", "Genetic, environmental", "Moisturizers", "Steroid creams", "Avoid irritants", "Dermatological"));
        diseaseDTOS.add(new DiseaseDTO(45, "Glaucoma", "Eye condition damaging optic nerve", "Vision loss, eye pain", "High eye pressure", "Eye drops", "Surgery", "Regular eye exams", "Ophthalmological"));
        diseaseDTOS.add(new DiseaseDTO(46, "Cataracts", "Clouding of eye lens", "Blurred vision, sensitivity", "Aging", "Surgery", "Lens replacement", "UV protection", "Ophthalmological"));
        diseaseDTOS.add(new DiseaseDTO(47, "Macular Degeneration", "Eye condition affecting central vision", "Blurred central vision", "Aging", "Anti-VEGF drugs", "Vitamins", "Healthy diet", "Ophthalmological"));
        diseaseDTOS.add(new DiseaseDTO(48, "Gastritis", "Inflammation of stomach lining", "Abdominal pain, nausea", "Infection, medications", "Antacids", "Antibiotics", "Diet changes", "Gastrointestinal"));
        diseaseDTOS.add(new DiseaseDTO(49, "Ulcer", "Open sore in stomach lining", "Burning pain, bloating", "H. pylori infection", "Antibiotics", "PPIs", "Avoid NSAIDs", "Gastrointestinal"));
        diseaseDTOS.add(new DiseaseDTO(50, "Pancreatitis", "Inflammation of pancreas", "Severe abdominal pain, nausea", "Gallstones, alcohol", "Fluid therapy", "Pain management", "Low fat diet", "Gastrointestinal"));


        //Filter names longer than 5 characters
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getName().length() > 5)
                .forEach(diseaseDTO -> System.out.println(diseaseDTO.getName()));


        //Filter diseases starting with specific letter like D
        System.out.println("\nDiseases starting with D:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getName().startsWith("D"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO.getName()));


        System.out.println("\nConvert all names to uppercase:");
        diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getName().toUpperCase())
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));


        //Get length of each string
        System.out.println("Get length of each string:");
        diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getName().length())
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Convert all names to lowercase
        System.out.println("\nConvert all names to lowercase:");
        diseaseDTOS.stream()
                .map(diseaseDTO -> diseaseDTO.getName().toLowerCase())
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Filter numbers > 10, then double them
        System.out.println("\nFilter numbers > 10, then double them:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getId() > 10)
                .map(diseaseDTO -> diseaseDTO.getId() * 2)
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Filter by multiple conditions
        System.out.println("\nFilter by multiple conditions:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getName().length() > 10 && diseaseDTO.getId() > 10)
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Convert strings to objects
        System.out.println("\nConvert strings to objects:");
        diseaseDTOS.stream()
                .map(DiseaseDTO -> new DiseaseDTO())
                .map(diseaseDTO -> diseaseDTO.getName())
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Print diseases ending with "a".
        System.out.println("\nPrint diseases ending with \"a\":");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getName().endsWith("a"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));


        //Print diseases whose symptoms contain:fever
        System.out.println("\nPrint diseases whose symptoms contain:fever");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getSymptoms().contains("Fever"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Print diseases caused by Virus
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getCause().equals("Virus"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Print diseases caused by Bacteria
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getCause().equals("Bacteria"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Print diseases whose prevention contains Vaccine
        System.out.println("\nPrint diseases whose prevention contains Vaccine:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getPrevention().equals("Vaccine"))
                .map(diseaseDTO -> diseaseDTO.getName())
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Find diseases having Memory loss
        System.out.println("\nFind diseases having Memory loss:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getSymptoms().contains("Memory loss"))
                .map(diseaseDTO -> diseaseDTO.getName())
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));


        //Find diseases having Headache
        System.out.println("\nFind diseases having Headache:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getSymptoms().contains("Headache"))
                .map(diseaseDTO -> diseaseDTO.getName())
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));


        System.out.println("\nFind diseases whose treatment contains Antibiotic:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getTreatment().contains("Antibiotic"))
                .map(diseaseDTO -> diseaseDTO.getName())
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));


        //Find diseases whose cure contains Available
        System.out.println("\nFind diseases whose cure contains Available:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getCure().contains("Available"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Find diseases whose cure contains No Cure
        System.out.println("\nFind diseases whose cure contains No Cure:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getCure().contains("No Cure"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO.getName()));

        //Filter diseases having id greater than 25.
        System.out.println("\n Filter diseases having id greater than 25:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getId() > 25)
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));

        //Filter diseases having id between 10 and 30.
        System.out.println("\nFilter diseases having id between 10 and 30:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getId() >= 10 && diseaseDTO.getId() <= 30)
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));


        //Filter diseases whose etiology contains Genetic
        System.out.println("\nFilter diseases whose etiology contains Genetic:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getEtiology().contains("Parasitic"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO.getName()));


        //Filter diseases whose etiology contains Environmental
        System.out.println("\nFilter diseases whose etiology contains Environmental:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getEtiology().contains("Environmental"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO.getName()));


        //Filter diseases whose name contains itis
        System.out.println("\n Filter diseases whose name contains itis:");
        diseaseDTOS.stream()
                .filter(diseaseDTO -> diseaseDTO.getName().contains("itis"))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));


        //Sort diseases by name.
        System.out.println("\n Sort diseases by name:");
        diseaseDTOS.stream()
                .sorted((diseaseDTO1, diseaseDTO2) -> diseaseDTO1.getName().compareTo(diseaseDTO2.getName()))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));


        //Sort diseases by id descending.
        System.out.println("\nSort diseases by id descending:");
        diseaseDTOS.stream()
                .sorted((diseaseDTO1, diseaseDTO2) -> Integer.compare(diseaseDTO2.getId(), diseaseDTO1.getId()))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO.getId() + " " + diseaseDTO.getName()));


        //Sort diseases by treatment.
        System.out.println("\nSort diseases by treatment:");
        diseaseDTOS.stream()
                .sorted((diseaseDTO1,diseaseDTO2) -> diseaseDTO1.getTreatment().compareTo(diseaseDTO2.getTreatment()))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO));


        //Sort diseases by cure.
        System.out.println("\nSort diseases by cure:");
        diseaseDTOS.stream()
                .sorted((diseaseDTO1,diseaseDTO2) -> diseaseDTO1.getCure().compareTo(diseaseDTO2.getCure()))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO.getId() +" "+ diseaseDTO.getName()));

        //Sort diseases by prevention.
        System.out.println("\nSort diseases by prevention:");
        diseaseDTOS.stream()
                .sorted((diseaseDTO1,diseaseDTO2) -> diseaseDTO1.getPrevention().compareTo(diseaseDTO2.getPrevention()))
                .forEach(diseaseDTO -> System.out.println(diseaseDTO.getId()+" - "+diseaseDTO.getName()+" - "+diseaseDTO.getPrevention()));


        //Sort diseases by symptoms.
        System.out.println("\n Sort diseases by symptoms:");












    }
}
