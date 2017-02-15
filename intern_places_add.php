<?php
require 'con.php';
$name=$_GET["name"];
$place_img_url=$_GET["places_img_url"];
$places_info=$_GET["places_info"];
$places_google_url=$_GET["places_google_url"];
$sql_query="insert into intern_place 
		values('Taj Mahal','http://newimageshd.com/wp-content/uploads/2016/06/Amazing-Taj-Mahal-HD-Wallpaper-1024x819.jpeg',
		'Taj Mahal is great place','null')";
if(mysqli_query($con, $sql_query)){
	echo "Data insertion success";
}
else{
	echo "Error".mysqli_error($con);

}
?>