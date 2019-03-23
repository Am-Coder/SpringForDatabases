/**
 * 
 */

var but = document.getElementById("but");
var are= document.getElementById("name");
$(document).ready(
		function(){
            $("#myform").submit(function myfun(event){
            	event.preventDefault();//prevents default form submission  
            	console.log(2);
                $.ajax({
                    type : "GET",
                    cache: false,
                    contentType : "application/json",//type of data being send to server
                    url : "find",
                    data : ({"rollno": $("#rollno").val()}),
                    
                    dataType : 'json',//result expected from server
                					//with json return type we can return java objects
                    				//With text we can return String from java conroller
                    timeout : 100000,
                    success : function(data) {
                    	alert(typeof(data));
                    	$("#name").html(data["name"]);
//                    	alert(data);
//                    	$("#name").html(data);

                    	console.log(data)
                        console.log("SUCCESS: ", data);
                    },
                    error : function(e) {
                        console.log("ERROR: ", e);
                        display(e);
                    },
                    done : function(e) {
                        console.log("DONE");
                    }
                });
            }
        )
		}

)