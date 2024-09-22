/*function for profile*/
function toggleDropdown() {
  var dropdown = document.getElementById("dropdown");
  dropdown.classList.toggle("show");
}

// Close the dropdown when clicking outside
window.addEventListener("click", function(event) {
  var dropdown = document.getElementById("dropdown");
  var avatar = document.querySelector(".user-avatar");
  if (!event.target.matches(".user-avatar") && !event.target.matches(".dropdown-content")) {
    dropdown.classList.remove("show");
  }
});