
public class DynamicXpath {

	// 1)single attribute
	// from https://www.progressive.com
	// element Zipcode
	// //input[@id='zipCode']

	// 1.2) single attribute
	// from https://www.netflix.com
	// element signIn
	// //a[@role='button']

	// 1.3) single attribute
	// from https://www.netflix.com
	// element Get Started
	// //button[@role='button']

	// 1.4) single attribute
	// from https://www.netflix.com
	// element Email address
	// //input[@id='95dda17ddac30']

	// 1.5) single attribute
	// from https://www.amazon.com
	// element amazon logo
	// //a[@id='nav-logo-sprites']

	// 2)multiple attribute with 'and' logic
	// from https://www.progressive.com
	// element auto
	// //select[@id='product' and @name='Product' and @class='required']

	// 2.2)multiple attribute with 'and' logic
	// from https://www.netflix.com
	// element Email address
	// //input[@autocomplete='email' and @minlength='5' and @maxlength='50' and
	// @type='email' and @id='95dda17ddac30']
	// or //input[@id='95dda17ddac30' and @name='email']

	// 2.3)multiple attribute with 'and' logic
	// from https://www.amazon.com
	// element Hello, sign in
	// //span[@id='nav-link-accountList-nav-line-1' and @class='nav-line-1
	// nav-progressive-content']

	// 2.4)multiple attribute with 'and' logic
	// from https://www.amazon.com
	// element Hello
	// //span[@class='nav-line-1 nav-progressive-content' and
	// @id='glow-ingress-line1']

	// 2.5)multiple attribute with 'and' logic
	// from https://www.hollisterco.com
	// element sign in or join
	// (//button[@aria-disabled='false' and @class='button '])[1]

	// 3) inner text attribute
	// from https://www.macys.com
	// element Furniture
	// //span[text()='Furniture']

	// 3.2) inner text attribute
	// from https://www.macys.com
	// element man
	// //span[text()='Men']

	// 3.3) inner text attribute
	// from https://www.macys.com
	// element woman
	// //span[text()='Women']

	// 3.4) inner text attribute
	// from https://www.macys.com
	// element kids
	// //span[text()='Kids']

	// 3.5) inner text attribute
	// from https://www.macys.com
	// element Home
	// //span[text()='Home']

	// 4) partial inner text attribute
	// from https://www.macys.com
	// element Beauty
	// //span[contains(text(),'Beauty')]

	// 4.2) partial inner text attribute
	// from https://www.macys.com
	// element Shoes
	// (//span[contains(text(),'Shoes')])[1]

	// 4.3) partial inner text attribute
	// from https://www.macys.com
	// element Handbags
	// //span[contains(text(),'Handbags')]

	// 4.4) partial inner text attribute
	// from https://www.macys.com
	// element Jewelry
	// //span[contains(text(),'Jewelry')]

	// 4.5) partial inner text attribute
	// from https://www.macys.com
	// element Toys
	// //span[contains(text(),'Toys')]

	// 5)Tag with attributes and use of contains
	// from https://www.verizon.com
	// element logo
	// (//a[contains(@class,'gnav20-logoWhiteBg')])[1]

	// 5.2)Tag with attributes and use of contains
	// from https://www.verizon.com
	// element shop
	// (//button[contains(@id,'gnav20-Shop-L1')])[1]

	// 5.3)Tag with attributes and use of contains
	// from https://www.verizon.com
	// element why Verizon
	// (//button[contains(@id,'gnav20-Why-Verizon-L1')])[1]

	// 5.4)Tag with attributes and use of contains
	// from https://www.verizon.com
	// element textinput search ber
	// //input[contains(@class,'font_24 bold  TextInput__Input-dYZOmi cuoGVx TextInput__BaseInput-eWTGnq cPdvto')]

	// 5.5)Tag with attributes and use of contains
	// from https://www.verizon.com
	// element help me choose
	// //div[contains(@class,'_15gifts-tab-text-wrapper fgifts-uwwqev')]

}
