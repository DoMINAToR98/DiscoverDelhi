<?php
require "con.php";

$query="select * from intern_place";
$result=mysqli_query($con,$query);
$emparray = array();
while($row =mysqli_fetch_assoc($result))
{
	$emparray[] = $row;
}
echo json_encode($emparray);

?>