function remove(){
	sessionStorage.removeItem("id");
	sessionStorage.removeItem("nickname");
	sessionStorage.removeItem("portrait");
	sessionStorage.removeItem("gender");
	sessionStorage.removeItem("age");
	sessionStorage.removeItem("qq");
	sessionStorage.removeItem("email");
}

function add(user){
	sessionStorage.setItem('id', user.id);
	sessionStorage.setItem('nickname', user.nickname);
	sessionStorage.setItem('portrait', user.portrait);
	sessionStorage.setItem('gender', user.gender);
	sessionStorage.setItem('age', user.age);
	sessionStorage.setItem('qq', user.qq);
	sessionStorage.setItem('email', user.email);
}