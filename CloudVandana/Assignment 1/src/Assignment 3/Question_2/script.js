const form = document.getElementById('surveyForm');
const popup = document.getElementById('popup');
const popupData = document.getElementById('popup-data');

form.addEventListener('submit', function (e) {
    e.preventDefault();
    openPopup();
});

function openPopup() {
    const firstName = form.firstName.value;
    const lastName = form.lastName.value;
    const dob = form.dob.value;
    const country = form.country.value;
    const gender = Array.from(form.gender).filter((checkbox) => checkbox.checked).map((checkbox) => checkbox.value).join(', ');
    const profession = form.profession.value;
    const email = form.email.value;
    const mobile = form.mobile.value;

    const data = `
    <p><strong>First Name:</strong> ${firstName}</p>
    <p><strong>Last Name:</strong> ${lastName}</p>
    <p><strong>Date of Birth:</strong> ${dob}</p>
    <p><strong>Country:</strong> ${country}</p>
    <p><strong>Gender:</strong> ${gender}</p>
    <p><strong>Profession:</strong> ${profession}</p>
    <p><strong>Email:</strong> ${email}</p>
    <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    popupData.innerHTML = data;
    popup.style.display = 'block';
}

function closePopup() {
    popup.style.display = 'none';
    form.reset();
}
