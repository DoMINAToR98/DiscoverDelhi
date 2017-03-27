<?php
require "con.php";
//$region=$_GET['places'];
$query="select * from intern_shop";

$result=mysqli_query($con,$query);
$emparray = array();
while($row =mysqli_fetch_assoc($result))
{
	$emparray[] = $row;
}
$final=array("shop"=>$emparray);
//echo json_encode($final,64);
echo json_encode($final,JSON_UNESCAPED_SLASHES);

?>
