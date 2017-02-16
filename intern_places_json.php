<?php
require "con.php";

$query="select * from intern_place";
$result=mysqli_query($con,$query);
$emparray = array();
while($row =mysqli_fetch_assoc($result))
{
	$emparray[] = $row;
}
$final=array("places"=>$emparray);
//echo json_encode($final,64);
echo json_encode($final,JSON_UNESCAPED_SLASHES);
?>
