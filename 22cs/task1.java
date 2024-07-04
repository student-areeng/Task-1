 Function for search functionality
function myFun() {
    let searchVal = document.getElementById(inp).value.toUpperCase();
    let table = document.getElementsByTagName(table);
    let tr = document.getElementsByTagName(tr);
    let front = document.querySelector(.main);

    for (let i = 0; i  tr.length; i++) {
        let td = tr[i].getElementsByTagName(td)[0];
        if (td) {
            let text = td.innerText.toUpperCase();
            if (text.indexOf(searchVal)  -1) {
                tr[i].style.display = ;
                front.style.display = none;
            } else {
                tr[i].style.display = none;
            }
        }
    }

    if (searchVal === ) {
        front.style.display = flex;
    }
    console.log(searchVal);
}

 Function to show navigation menu
function nav() {
    let nav = document.querySelector(.nav);
    nav.style.display = block;
    let login = document.querySelector(.login);
    login.style.display = none;
}

 Function to show login form
function login() {
    let login = document.querySelector(.login);
    login.style.display = block;
    let nav = document.querySelector(.nav);
    nav.style.display = none;
}

 Slide animation for customer reviews
let slide = document.querySelectorAll(.customer);
let count = 0;

slide.forEach(function(customer, index){
    customer.style.left = ${index  100}%;
});

function next() {
    count++;
    if (count === slide.length) {
        count = 0;
    }
    bar();
}

function pre() {
    count--;
    if (count === -1) {
        count = slide.length - 1;
    }
    bar();
}

function bar() {
    slide.forEach(function(customer) {
        customer.style.transform = translateX(-${count  100}%);
    });
}

 Example object and console log
let a = {
    greet HI
};
let c;
c = a;
a.age = 11;

console.log(c.age);  Output 11

 Function to toggle menu visibility
function toggleMenu() {
    var menuItems = document.getElementById(menuItems);
    if (menuItems.style.display === block) {
        menuItems.style.display = none;
    } else {
        menuItems.style.display = block;
    }
}

 Function to handle navigation
function navigateTo(section) {
     Implement your navigation logic here, e.g., using window.location.href or AJAX
    switch (section) {
        case 'home'
             Example window.location.href = home;
            console.log(Navigating to Home);
            break;
        case 'foods'
             Example window.location.href = foods;
            console.log(Navigating to Foods);
            break;
        case 'blog'
             Example window.location.href = blog;
            console.log(Navigating to Blog);
            break;
        case 'customer'
             Example window.location.href = customer;
            console.log(Navigating to Customer);
            break;
        default
            console.log(Unknown section);
            break;
    }

     After navigation, hide the menu
    var menuItems = document.getElementById(menuItems);
    menuItems.style.display = none;
}