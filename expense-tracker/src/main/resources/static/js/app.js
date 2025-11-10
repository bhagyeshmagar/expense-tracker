document.addEventListener('DOMContentLoaded', function () {
  // Delegate click handling so it works for dynamic rows too
  document.querySelectorAll('.expense-delete-btn').forEach(function (btn) {
    btn.addEventListener('click', function (ev) {
      const id = btn.getAttribute('data-id');
      const form = document.getElementById('confirmDeleteForm');
      if (form && id) {
        // set action to the exact endpoint your controller expects
        form.setAttribute('action', '/expenses/delete/' + id);
      }
    });
  });
});
