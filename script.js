const bandButton = document.getElementById('darkmode')

bandButton.addEventListener('click', ()=> {
    const isDarkMode = document.body.classList.toggle('dark-mode')


if (!isDarkMode) {
    bandButton.innerText = 'Batti Chalu'
} else {
    bandButton.innerText = 'Batti Gulll'
}

})