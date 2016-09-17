<html>
<head>
<title>You have added a student ?>
</title>
</head>

<body style="background-color:lightgrey">
<h2>You have been added <?php $_POST["name"] ?> </h2><br />

<?php

$doc = array(

                        "Name" => $_POST["name"] ,
                        "SJSU_ID" => $_POST["id"] ,
                        "Phone" => $_POST["phone"] ,
                        );

$json_op = json_encode($doc, JSON_PRETTY_PRINT);
  echo "$json_op","<br />";

//Establish connection to localhost
$connection = new MongoClient();


//Connect to the CMPE273 database in localhost
$db = $connection->CMPE273;

//Handle to the students collection inside the CMPE273 database
$student_collection = $db->students;

//Inserting the document in the collection
$student_collection->insert($doc);


?>
To go to the list of students, <a href = "student_info.php">click here</a>
</body>
</html>
