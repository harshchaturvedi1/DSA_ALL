var elements = document.querySelectorAll(".disable-select");

elements.forEach(function (element) {
  element.style.userSelect = "auto";
  element.style.webkitUserSelect = "auto";
});
