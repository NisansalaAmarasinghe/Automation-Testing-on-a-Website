# Automation-Testing-on-an-Website
This project outlines the test automation process conducted using Selenium WebDriver on an official website. The test suite focuses on various functionalities and user interactions within the website.
<h2>Description</h2>
  <ul>
    <li><strong>Testing Framework:</strong> Selenium WebDriver</li>
    <li><strong>Development Environment:</strong> IntelliJ IDEA</li>
    <li><strong>Project Management:</strong> Maven Projects</li>
    <li><strong>Test Framework Assertions:</strong> TestNG</li>
    <li><strong>Element Identification:</strong> Xpath and ID attributes (Selectors Hub used for verification)</li>
    <li><strong>Coding Style:</strong> Method Chaining for improved readability</li>
    <li><strong>Browser Compatibility:</strong> Chrome Options used to match project with browser version</li>
  </ul>

  <h2>Main Test Cases</h2>

  <h3>1. Login Functionality (Before Registering)</h3>
  <ul>
    <li><strong>Sub-cases:</strong>
      <ul>
        <li>Click on the Login button from the Dashboard.</li>
        <li>Enter a valid email address (e.g., mifipa8360@mposhop.com) in the email field.</li>
        <li>Enter a password (e.g., 1234) in the password field.</li>
        <li>Click on the Login button.</li>
      </ul>
    </li>
    <li><strong>Expected Result:</strong> An alert message stating "Please register before login" should appear.</li>
  </ul>

  <h3>2. New Registration Form</h3>
  <ul>
    <li><strong>Sub-cases:</strong>
      <ul>
        <li>Click on the Login button from the Dashboard.</li>
        <li>Enter a full name (e.g., Harry Potter) in the New Registration field.</li>
        <li>Enter a unique email address (e.g., rakeham945@dcbin.com) in the email field.</li>
        <li>Enter a valid phone number (e.g., 0715645852) in the phone number field.</li>
        <li>Click on the Create New Account button.</li>
      </ul>
    </li>
    <li><strong>Expected Result:</strong>
      <ul>
        <li>Success message: "Registration Successful" appears upon successful registration.</li>
        <li>Error message: "This email already register. Please check your emails again!" appears if the email is already registered.</li>
      </ul>
    </li>
  </ul>

  <h3>3. Mouse Movements on Homepage</h3>
  <ul>
    <li><strong>Sub-cases:</strong>
      <ul>
        <li>Move the mouse over each of the 7 tabs in the Navigation Bar (verify visibility).</li>
        <li>Move the mouse over the Advertisement Banner and click the navigation arrows.</li>
        <li>Navigate to each page in the Navigation Bar: Products, Brands, Added Services, Duty Free, Omni Cart, Hot Deals, Loyalty Program. (Verify successful page loading)</li>
        <li>On the Omni Cart Page, record the initial location of the slider point before moving.</li>
        <li>Navigate to the Singer button and verify it returns to the homepage.</li>
      </ul>
    </li>
  </ul>

  <h3>4. Placing an Order</h3>
  <ul>
    <li><strong>Sub-cases:</strong>
      <ul>
        <li>Access the Cart page.</li>
        <li>Click on "Continue Shopping."</li>
        <li>Search for a product using the search bar.</li>
        <li>Select the desired product for purchase.</li>
        <li>Proceed to purchase the selected product.</li>
        <li>Confirm the order details.</li>
      </ul>
    </li>
  </ul>

  <h3>5. Checkbox Selections in Products</h3>
  <ul>
    <li><strong>Sub-cases:</strong>
      <ul>
        <li>Navigate to the Products Page.</li>
        <li>Select the "Device" category from the checkbox list.</li>
        <li>Select the "Mobile Phone" subcategory.</li>
        <li>Record the initial location of the slider point before moving within the Mobile Phone category.</li>
        <li>Select the "Projector" subcategory.</li>
        <li>Navigate back to the homepage using the Singer button.</li>
      </ul>
    </li>
  </ul>
