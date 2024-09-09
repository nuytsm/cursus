document.addEventListener("DOMContentLoaded", function() {
    document.querySelectorAll('.collapsible').forEach(item => {
      item.addEventListener('click', function() {
        const content = this.nextElementSibling;
        content.style.display = (content.style.display === 'block') ? 'none' : 'block';
      });
    });
  });