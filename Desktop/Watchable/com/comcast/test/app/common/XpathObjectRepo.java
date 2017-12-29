package comcast.test.app.common;

public interface XpathObjectRepo {

	String SIGNUP_EMAIL_XPATH = "";

	String FORGOT_PASSWD_LINK_XPATH = "//div[@id='registration-tabs']/descendant::a[contains(@href,'reset')]";
	String FORGOT_PASSWD_EMAIL_XPATH = "//div[@id='registration-tabs']/descendant::input[@id='email']";
	String FORGOT_PASSWD_EMAIL_HEADER_XPATH = "//div[@id='registration-tabs']/descendant::div[@class='top']/h3";
	String FORGOT_PASSWD_INVALID_EMAILFORMAT_XPATH = "//div[@id='registration-tabs']/descendant::label[contains(@for,'email')]";
	String USERNAME_TOPMENU_XPATH = "//div[@id='tool-menu']/descendant::div[contains(@class,'user')]";
	String LOGOUT_XPATH = "//div[@id='tool-menu']/descendant::li/a[contains(@href,'logout')]";
	String ACCOUNT_TOPMENU_XPATH = "//div[@id='tool-menu']/descendant::li/a[contains(@href,'edit')]";
	String ACCOUNT_ZIP_TEXTFLD_XPATH = "//div[contains(@id,'registration')]/descendant::input[contains(@name,'user')]";
	String ACCOUNT_ZIP_EMPTYFLD_MSG_XPATH = "//div[@id='registration-tabs']/descendant::label[@class='error'][contains(@for,'zip')]";

	String CURRENTPASSWDVERIFICATIONMSG_XPATH = "//div[@id='content-wrap']/descendant::label";
	String FOOTERVIDEOCATEGORIES_XPATH = "//div[@id='footercategory']/div[contains(@class,'title')]";
	String FOOTERCATEGORIES_ANIMATION_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'animation')]";
	String FOOTERCATEGORIES_AUTO_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'auto')]";
	String FOOTERCATEGORIES_ENTERTAINMENT_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'entertainment')]";
	String FOOTERCATEGORIES_FASHIONSTYLE_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'fashion')]";
	String FOOTERCATEGORIES_FOOD_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'food')]";
	String FOOTERCATEGORIES_FUNNY_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'funny')]";
	String FOOTERCATEGORIES_GAMING_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'gaming')]";
	String FOOTERCATEGORIES_MUSIC_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'music')]";
	String FOOTERCATEGORIES_NEWS_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'news')]";
	String FOOTERCATEGORIES_SCIENCETECH_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'science')]";
	String FOOTERCATEGORIES_SERIES_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'series')]";
	String FOOTERCATEGORIES_SPORTS_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'sports')]";
	String FOOTERCATEGORIES_TRAVELEVENTS_XPATH = "//div[@id='footerCatNav']/descendant::div/a[contains(@href,'travel')]";
	String FOOTER_CATEGORY_HEADER_XPATH = "//div[@id='content-wrap']/descendant::section[contains(@class,'fixed')]/header/h1";
	String FOOTER_CATEGORY_TITLEHEADER_XPATH = "//div[@id='content-wrap']/descendant::section[contains(@class,'fixed')]/h2";
	String FOOTER_CATEGORY_TYPES_HEADER_XPATH = "//div[@id='content-wrap']/descendant::li/a[contains(@class,'active')]";
	String FOOTER_VIDEO_CATEGORIES_XPATH = "//div[@id='footerCatNav']/descendant::div/div[";
	String FOOTER_VIDEO_CATEGORIES_TITLES = "/descendant::li[";
	String FOOTER_CATEGORIES_TYPES_CHANNELLIST_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'wrapper')]/descendant::ul/li[";
	String FOOTER_CATEGORIES_TYPES_CHANNELLIST_TITLE_XPATH = "/descendant::h1/a";
	String FOOTER_GENRE_TYPES_CHANNELS_NEXTBTN_ENABLED_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'seq')]/descendant::a[contains(@class,'next')]/span";
	String FOOTER_GENRE_TYPES_SHOWS_FIRSTSHOWSTITLE_XPATH = "//div[@class='seq-content-list']/descendant::div[@class='list1']/descendant::li[";
	String FOOTER_GENRE_TYPES_SHOWS_FIRSTSHOWSTITLE_HEADER_XPATH = "]/descendant::h1";
	String FOOTER_GENRE_TYPES_EPISODES_LIST_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'seq')]/descendant::div[@class='list2']/descendant::li[";

	String FORGOT_PASSWORD_SUBMITBTN_XPATH = "//div[@id='registration-tabs']/descendant::fieldset/button[@type='submit']";

	String WATCHABLE_LOGO = "//div[@id='header-wrap']/descendant::img[@id='logo']";

	// Lekshmi added
	// Navigation Menu
	String TOPMENUSIGNUP_XPATH = "//div[@id='access-menu']/descendant::a[contains(@class,'signup')]";
	String TOPMENULOGIN_XPATH = "//div[@id='access-menu']/descendant::a[contains(@class,'login-bttn')]";
	String TOPMENUHOME_XPATH = "//div[@id='nav-menu']/descendant::li/a[contains(@class,'home-bttn')]";
	String USERNAME_XPATH = "//input[@id='login_username']";
	String PASSWORD_XPATH = "//input[@id='login_psd']";
	String LOGIN_PAGE_EMAILHEADER_XPATH = "//div[@id='registration-tabs']/descendant::fieldset[@class='first']/descendant::h3";
	String LOGIN_PAGE_PASSWDHEADER_XPATH = "//div[@id='registration-tabs']/descendant::fieldset[2]/div[@class='top']/h3";
	String SIGNUPPAGE_INCORRECT_CREDENTIALS_MSG_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'register')]/ul/label[@class='error']";
	String SIGNUPPAGE_EMPTYPASSWD_WARNMSG_XPATH = ".//*[@id='step-0']/fieldset[2]/div[2]/label/label";
	String SIGNUPPAGE_EMPTYCONFPASSWD_WARNMSG_XPATH = ".//*[@id='step-0']/fieldset[3]/div[2]/label/label";
	String SIGNUPPAGE_EMPTYSECURITYCHK_WARNMSG_XPATH = ".//*[@id='recaptcha_widget']/div[7]/label/label";
	String SIGNUPPAGE_EMPTYTERMS_CHEKBOX_WARNMSG_XPATH = ".//*[@id='step-0']/fieldset[6]/label";
	String SIGNUPPAGE_INCORRECTEMAILFORMAT_WARNMSG_XPATH = ".//*[@id='step-0']/fieldset[1]/div[2]/label/label";
	String ACCOUNT_ZIP_FLDVALIDATION_MSG_XPATH = ".//*[@id='step-0']/fieldset[4]/div[2]/label/label";
	String TOPMENU_USERNAME_LINK_XPATH = "//div[@id='tool-menu']/descendant::div[@class='js-user-name']";
	String TOPMENU_DROPDOWN_ACCOUNT_LINK_XPATH = "//div[@id='tool-menu']/descendant::div[@class='dropdown-box']/descendant::a[contains(@href, 'user/edit')]";
	String HEADER_XPATH = "//div[@id='header']";

	String RESETPASSMISMATCHWARNING_XPATH = "//div[@id='registration-tabs']/descendant::label[contains(@class,'error')]";
	String CAPTCHA_ERROR_XPATH = "//div[@id='recaptcha_widget']/descendant::label[contains(@for,'recaptcha')]";
	String SIGNUP_DUPEMAILID_USAGE_WARNING_XPATH = "//div[@id='registration-tabs']/descendant::label[contains(@for,'signup_username')]";
	String HOMESEARCHQUERYID_XPATH = "//input[@id='search-query']";
	String HOMESEARCHBUTTON_XPATH = "//input[@id='go-search']";
	String HOMESEARCHBOXMENU_XPATH = "//div[contains(@id,'menu')]/div[contains(@class,'search')]";
	String HOMEACTIVEBUTTON_XPATH = "//div[@id='nav-menu']/descendant::a[contains(@class,'home-bttn active-bttn')]";
	String HOMEINACTIVEBUTTON_XPATH = "//div[@id='nav-menu']/descendant::a[contains(@class,'home-bttn')]";
	String MYCHANNELSBUTTON_XPATH = "//div[@id='nav-menu']/descendant::a[contains(@class,'mychannels-bttn')]";
	String HELPBUTTON_XPATH = "//div[@id='nav-menu']/descendant::a[contains(@class,'help-bttn')]";
	String MYCHANNELSNAVMENU_XPATH = "//div[@id='nav-menu']/descendant::a[contains(@class,'mychannels')]";
	String TOPMENUDOWNARROW_XPATH = "//div[@id='tool-menu']/descendant::img[@id='dwn']";
	String TOPMENUUPARROW_XPATH = "//div[@id='tool-menu']/descendant::img[@id='up']";
	String SIGNUP_ACTIVE_BUTTON_XPATH = "//div[@id='access-menu']/descendant::a[contains(@class,'signup-bttn active-bttn')]";
	String SIGNUP_INACTIVE_BUTTON_XPATH = "//div[@id='access-menu']/descendant::a[contains(@class,'signup-bttn')]";
	String LOGIN_ACTIVE_BUTTON_XPATH = "//div[@id='access-menu']/descendant::a[contains(@class,'login-bttn active-bttn')]";

	String TOP_MENU_HOME_BUTTON_XPATH = "//div[@id='nav-menu']/descendant::li/a[contains(@class,'home-bttn')]";
	String TOP_MENU_MYCHANNELS_BUTTON_XPATH = "//div[@id='nav-menu']/descendant::a[contains(@class,'mychannels-bttn')]";
	String TOP_MENU_HELP_BUTTON_XPATH = "//div[@id='nav-menu']/descendant::a[contains(@class,'help-bttn')]";
	String TOP_MENU_LOGIN_BUTTON_XPATH = "//div[@id='access-menu']/descendant::a[contains(@class,'login-bttn')]";

	// Watchable logo
	String WATCHABLELOGOIMAGE_XPATH = "//img[@id='logo']";

	// Home page
	String HOMEFEATUREDCONTAINERLABEL_XPATH = "//div[@id='featured']/descendant::header/h1";
	String HOMEFEATUREDCONTAINER_FIRSTELEMENT_XPATH = "//div[@id='featured']/descendant::ul[1]/descendant::li[1]/article/h1/a";
	String HOMEPOPULARCHANNELSALLLIST_XPATH = "//div[@id='popular_channels']/descendant::li[contains(@class,'cell-channel')]";
	String HOMEPOPULARCHANNELS_FIRSTELEMENT_XPATH = "//div[@id='popular_channels']/descendant::ul[1]/descendant::li[1]/article/h1/a";
	String HOMEPOPULARCHANNELS_IMG_XPATH = "//div[@id='popular_channels']/descendant::ul/li/descendant::div[contains(@class,'wrapper')]/div[@class='icon']";
	String HOMEPOPULARSHOWSTITLELABEL_XPATH = "//div[@id='popular_shows']/descendant::header/h1";
	String HOMEPOPULARSHOWS_FIRSTELEMENT_XPATH = "//div[@id='popular_shows']/descendant::ul[1]/descendant::li[1]/article/h1/a";
	String HOMEPOPULARCHANNELSTITLELABEL_XPATH = "//div[@id='popular_channels']/descendant::header/h1";
	String HOMEPOPULARCHANNELSLIST_XPATH = "//div[@id='popular_channels']/descendant::ul";
	String HOMEPOPULARCHANNELS_SUBTITLABEL_XPATH = "//div[@id='popular_channels']/descendant::div[@class='subtitle']";
	String HOMEFEATUREDLIST_XPATH = "//div[@id='featured']/descendant::ul/descendant::li";
	String HOMEFEATUREDLISTSTITLELABEL_XPATH = "//div[@id='featured']/descendant::ul/descendant::li/descendant::h1/a";
	String HOMEFEATUREDNEXTBUTTON_XPATH = "//div[@id='featured']/descendant::a[@class='next']";
	String HOMEPAGE_DETAILS = "//div[@id='content-wrap']/descendant::section[contains(@class,'list')]";
	String HOMEGENRESCHNNLHEADERLABEL_XPATH = "//div[@class='genre-header']/descendant::a[contains(@class,'icn-tile')]";
	// String HOMEGENRECHANNELANIMATIONTITLE_XPATH =
	// "//div[@id='genre']/descendant::a[contains(@href,'/genres/200-animation')]";
	// String HOMEGENRECHANNELSTITLE_XPATH =
	// "//div[@class='genre-container']/descendant::header";
	String HOMEGENRECHANNELSLIST_XPATH = "//div[@class='genre-container']/descendant::ul";
	String HOMEGENRECHANNELSTITLELIST_XPATH = "//div[@id='genre']/descendant::div[@class='genre-container']/descendant::header";
	String HOMEGENRECHANNELSPAGINATIONBUTTON_XPATH = "//div[@id='genre']/descendant::a[contains(@class,'next')]";
	String HOMEPAGE_GENRES_SHOWS_TITLEHEADERLIST_XPATH = "//div[@id='genre']/descendant::div[contains(@class,'genre')]/div[";
	String HOMEPAGE_GENRES_SHOWS_TITLE_XPATH = "//div[@id='genre']/descendant::div[contains(@class,'genre')]/div[";
	String HOMEPAGE_GENRES_LIST_XPATH = "]/descendant::li[1]/descendant::h1/a";
	String HOMEPAGE_GENRES_SHOWS_TITLEHEADER_XPATH = "/descendant::header/h1";
	String HOMEPAGE_GENRES_SHOWSLIST_XPATH = "/descendant::ul";
	String HOMEPAGE_GENRES_SHOWLIST_NEXTBTN_XPATH = "/descendant::a[@class='next']";
	String HOMEPAGE_GENRES_SHOWS_HEADER_XPATH = "//div[@id='genre']/descendant::header[contains(@class,'list-header')]/descendant::a[contains(@class,'active')]";
	String HOMEPAGE_GENRES_FULLCONTAINER_XPATH = ".//*[@id='genre']/descendant::div[contains(@class,'genre-container')]/div[";
	String HOMEPAGE_GENRE_FASHIONSTYLE_HEADER_XPATH = "//div[@id='genre']/descendant::h1/a";
	String HOMEPAGEYOUAREWATCHINGVIDEOSLIST_XPATH = "//div[@id='upNext']/descendant::li[contains(@class,'episode')]/descendant::h1";
	String HOMEPAGEYOUAREWATCHINGVIDEOSLINK_XPATH = "//div[@id='upNext']/descendant::li";
	String HOMEPAGEYOUAREWATCHINGFIRSTVIDEOLINK_XPATH = "//div[@id='upNext']/descendant::li[1]/descendant::h1/a";
	String HOMEPAGEYOUAREWATCHINGPAGINATIONNEXTBUTTON_XPATH = "//div[@id='upNext']/descendant::a[@class='next']/span";

	// SIGNUP Form
	String SIGNUPFORM_EMAIL_HEADER_XPATH = "//div[@id='registration-tabs']/descendant::div[@class='top'][1]/h3";
	String SIGNUPFORM_EMAIL_TEXTFIELD_XPATH = "//div[@id='registration-tabs']//input[contains(@id,'signup')]";
	String SIGNUPFORM_PASSWD_HEADER_XPATH = "//div[@id='registration-tabs']/descendant::div[@class='top'][2]/h3";
	String SIGNUPFORM_PASSWD_TEXTFIELD_XPATH = "//div[@id='registration-tabs']//input[contains(@id,'password')]";
	String SIGNUPFORM_CONFPASSWD_HEADER_XPATH = "//div[@id='registration-tabs']/descendant::div[@class='top'][4]/h3";
	String SIGNUPFORM_CONFPASSWD_TEXTFIELD = "//div[@id='registration-tabs']/descendant::label[contains(@class,'input')]/input[contains(@name,'confirm')]";
	String SIGNUPFORM_ZIP_HEADER_XPATH = "//div[@id='registration-tabs']/descendant::div[@class='top'][5]/h3";
	String SIGNUPFORM_ZIP_TEXTFIELD_XPATH = "//div[@id='registration-tabs']/descendant::label[contains(@class,'input')]/input[contains(@name,'zip')]";
	String SIGNUPFORM_CAPTCHA_IMAGE_HEADER_XPATH = "//div[@id='recaptcha_widget']/descendant::span[contains(@class,'image')]/h4";
	String SIGNUPFORM_CAPTCHA_AUDIO_HEADER_XPATH = "//div[@id='recaptcha_widget']/descendant::span[contains(@class,'audio')]/h4";
	String SIGNUPFORM_TERMSCONDITIONS_HEDAER_XPATH = "//div[@id='registration-tabs']/descendant::h3[5]";
	String SIGNUPFORM_PASSWDVALIDATION_HEADER_XPATH = "//div[@id='registration-tabs']/descendant::a[contains(@class,'fixed pwd')]";
	String SIGNUPFORM_TERMSCOND_CHECKBOX_XPATH = "//div[@id='registration-tabs']/descendant::label[contains(@class,'styled')]";
	String SIGNUPFORM_CAPTCHA_AUDIOBUTTN_XPATH = "//div[@id='recaptcha_widget']/descendant::a[contains(@href,'Recaptcha')]/img[contains(@src,'audio')]";
	String SIGNUPFORM_CAPTCHA_DOWNLOADLINK_XPATH = "//div[@id='recaptcha_widget']/descendant::a[contains(@id,'audio_download')]";
	String SIGNUPFORM_RECAPCHA_SHOWHELP_XPATH = "//div[@class='recaptcha_container']/descendant::img[contains(@src,'/assets/help.png')]";
	String RECAPCHA_SHOWHELP_HEADER_XPATH = "//article[@class='primary-article']/descendant::h2";
	String RECAPCHA_SHOWHELP_HELPING_LINK_XPATH = "//article[@class='primary-article']/descendant::ol[1]/descendant::li[3]";
	String SIGNUPFORM_CAPCHA_FIELD_XPATH = "//div[@class='recaptcha_container']/descendant::input[@id='recaptcha_response_field']";

	// Channel/Show Page
	String CHANNELFOLLOWNOWIMAGE_XPATH = "//div[@class='content_subscription']/descendant::input[contains(@src,'_subscribe')]";
	String CHANNELUNFOLLOWNOWIMAGE_XPATH = "//div[@class='content_subscription']/descendant::input[contains(@src,'_unsubscribe')]";
	String CHANNELDETAILSPAGETITLE_XPATH = "//div[@class='content-main']/descendant::h1[contains(@class,'title')]";
	String CHANNEL_DETAILSPAGE_CHANNEL_HEADER_LABEL_XPATH = "//div[@class='content-info']/descendant::h1[@class='content-label']";
	String CHANNELDETAILSFIRSTSHOWTITLE_XPATH = "//div[@class='seq-content-list']/descendant::div[@class='list0']/descendant::ul[@class='cell-fixed']/descendant::h1/a";
	String CHANNELDETAILSFIRSTEPISODETITLE_XPATH = "//div[@class='seq-content-list']/descendant::div[@class='list0']/descendant::div[@class='caroufredsel_wrapper']/descendant::li[1]/descendant::h1/a";
	String CHANNELDETAILSPUBLISHERTITLE_XPATH = "//div[@class='content-main']/descendant::div[@class='content-publisher']/descendant::a";
	String HOMEPOPULARCHANNELSROW_XPATH = "//div[@id='popular_channels']/descendant::section[@class='view-row']";
	String HOMEPOPULARSHOWSMARGINRIGHT_XPATH = "//div[@id='popular_shows']/descendant::ul[1]";
	String HOMEPOPULARSHOWSBUTTONNEXT_XPATH = "//div[@id='popular_shows']/descendant::a[contains(@class,'next')]";
	String HOMEPOPULARSHOWSBUTTONPREVIOUS_XPATH = "//div[@id='popular_shows']/descendant::a[contains(@class,'prev')]";
	String HOMEPOPULARSHOWSVIEWROW_XPATH = "//div[@id='popular_shows']/descendant::section[@class='view-row']";
	String HOMEPOPULARSHOWSFIRSTTITLELABEL_XPATH = "//div[@id='popular_shows']/descendant::ul[1]/descendant::h1[1]/a";
	String HOMEPOPULARCHANNELSBUTTONNEXT_XPATH = "//div[@id='popular_channels']/descendant::a[contains(@class,'next')]";
	String HOMEPOPULARCHANNELSFIRSTTITLELABEL_XPATH = "//div[@id='popular_channels']/descendant::ul[1]/descendant::h1[1]/a";
	String HOMEFEATUREDFIRSTTITLELABEL_XPATH = "//div[@id='featured']/descendant::ul[1]/descendant::h1[1]/a";
	String CHANNELDETAILSSHOWLIST_XPATH = "//div[@id='seq-row-list']";
	String HOMEPOPULARCHANNELSBUTTONPREVIOUS_XPATH = "//div[@id='popular_channels']/descendant::a[contains(@class,'prev')]";
	String MYCHNLS_NOSUBSCRIPTIONS_MSG_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'empty')]";
	String CHANNELDETAILSPAGESHOWSDATA_XPATH = "//div[@class='content-metadata']/descendant::li[1]";
	String FOLLOWUP_MSG_XPATH = "//div[@id='follow-tip']";

	String CHANNEL_DETAILS_SHOWS_LINK_XPATH = "//div[@class='seq-content-list']/descendant::ul/descendant::a[@href='#']";

	// You are watching section
	String YOUAREWATCHINGHEADERLABEL_XPATH = "//div[@id='upNext']/descendant::h1[1]";
	String SHOWEPISODELIST_XPATH = "//div[@id='seq-row-list']/descendant::li[1]/descendant::h1/a";
	String YOUAREWATCHINGROW_XPATH = "//div[@id='upNext']/descendant::div[@class='row']";

	// Featured
	String FEATUREDROWLIST_XPATH = "//div[@id='featured']/descendant::section[@class='view-row']";
	String FEATUREDROW_XPATH = "//div[@id='featured']/descendant::ul[1]";
	String FEATUREDICONS_XPATH = "//div[@id='featured']/descendant::div[@class='icon']";
	String FEATUREDICONSFIRSTTITLE_XPATH = "//div[@id='featured']/descendant::ul[1]/descendant::h1[1]/a";
	String NOOF_SHOWS_PARTONE_XPATH = "//div[@id='featured']/descendant::li[contains(@class,'cell-channel')][";
	String NOOF_SHOWS_PARTTWO_XPATH = "]/descendant::div[@class='subtitle']";
	// Show details Page
	String SHOWDETAILSHOWTITLE_XPATH = "//div[@class='content-info']/descendant::h1[@class='content-title']";
	String SHOWDETAILVIDEOSCOUNT_XPATH = "//div[@class='content-description']/descendant::div[@class='content-metadata']/descendant::li[1]";
	String SHOWDETAILVIDEOSUPDATED_XPATH = "//div[@id='content-wrap']/descendant::div[@class='content-metadata']/descendant::li[2]";
	String HOMEPOPULARSHOWSICON_XPATH = "//div[@id='popular_shows']/descendant::div[@class='icon']";
	String SHOWDETAILCHANNELTITLE_XPATH = "//div[@class='content-description']/descendant::a[contains(@href, 'channels')]";
	String SHOWDETAILSHOWDESCRIPTION_XPATH = "//div[@class='content-description']/descendant::div[contains(@class, 'description')]";
	String SHOWDETAILVIDEOLIST_XPATH = "//div[contains(@class,'list0')]";
	String SHOWDETAILSHOWLIST_XPATH = "//div[contains(@class,'seq-row-list')]";
	String FEATURED_PAGINATION_NEXT_XPATH = "//div[@id='featured']/descendant::a[contains(@class,'next')]/descendant::span";
	String FEATURED_PAGINATION_NEXT_SECTION_XPATH = "//div[@id='featured']/descendant::a[contains(@class,'next')]";
	// String SHOW

	// Channel details Page
	String CHANNELDETAILSHOWCOUNT_XPATH = "//div[@class='content-metadata']/descendant::li[1]";
	String CHANNELDETAILVIDEOSCOUNT_XPATH = "//div[@class='content-metadata']/descendant::li[2]";
	String CHANNELDETAILLASTUPDATED_XPATH = "//div[@class='content-metadata']/descendant::li[3]";
	String CHANNELDETAILSHOWTITLELABEL_XPATH = "//header[contains(@class,'header')]/descendant::li/a";
	String CHANNELDETAILCHANNELTITLE_XPATH = "//div[@class='content-info']/descendant::h1[@class='content-title']";
	String CHANNELDETAILPUBLISHERTITLE_XPATH = "//div[@class='content-info']/descendant::div[contains(@class,'publisher')]/descendant::a";
	String CHANNEL_DETAIL_SHOW_LINK_XPATH = "//div[@id='seq-row-list']/descendant::li[contains(@class,'cell-show')]";

	// Publisher Details Page
	String PUBLISHERPAGE_CHANNELSCOUNT_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'metada')]/ul/li[1]";
	String PUBLISHERPAGE_PUBLISHERTITLE_XPATH = "//div[@id='content-wrap']/descendant::h1[contains(@class,'title')]";
	// String
	// PUBLISHERPAGE_PUBLISHERDESCRPTN_XPATH="//div[@id='content-wrap']/descendant::div[contains(@class,'description')]/div[contains(@class,'wide')]";
	String PUBLISHERPAGE_PUBLISHERDESCRPTN_XPATH = "//div[@class='content-info']/descendant::div[contains(@class,'content-description-wide')]";
	String PUBLISHERPAGE_CHANNELSHEADER_XPATH = "//div[@id='content-wrap']/descendant::li/a[contains(@class,'active')]";
	String PUBLISHERPAGE_CATEGORIESHEADER_XPATH = "//div[@id='content-wrap']/descendant::li/a[contains(@class,'tile')]";
	String PUBLISHERPAGE_VIDEOSCOUNT_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'metadata')]/descendant::li[3]";
	String PUBLISHERPAGE_SHOWSCOUNT_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'metadata')]/descendant::li[2]";
	String PUBLISHERPAGE_UPDATEDDATE_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'metadata')]/descendant::li[4]";

	// Search Page
	String SEARCHEMPTYMESSAGE_XPATH = "//div[@class='seq-row-list']/descendant::div[contains(@class,'empty-msg')]";
	String SEARCH_RESULT_ROW_XPATH = "//div[@class='list0']/descendant::section[@class = 'view-row']";

	// My channels Page
	String MYCHANNELSCHANNELTITLELABEL_XPATH = "//div[@id='seq-row-list']/descendant::li[contains(@class,'cell-channel')]";
	String MYCHANNEL_SUBSCRIBEDCHANNELS_XPATH = "//div[@id='seq-row-list']/descendant::li[contains(@class,'cell-channel')]";
	String MYCHANNELSEPISODEICON_XPATH = "//li[contains(@class, 'episode')]/descendant::a[contains(@href, 'videos')]";
	String MYCHANNELS_FIRSTEPISODE_TITLE_XPATH = "//div[@class='caroufredsel_wrapper']/descendant::li[1]/descendant::h1/a";
	String MYCHANNELFIRSTCHANNELTITLE_XPATH = "//div[@id='seq-row-list']/descendant::div[@class='list0']/descendant::h1/descendant::a[contains(@href, 'channels')]";
	String MYCHANNELS_ACTIVEBUTTON_XPATH = "//div[@id='header']/descendant::li/a[contains(@class,'active')]";
	String MYCHANNELS_TITLE_LABEL_XPATH = "//div[@id='content-wrap']/article/header/h1";
	String MYCHANNELS_CHANNEL_LABEL_XPATH = "//div[@id='content-wrap']/descendant::nav[@class='view-type']/descendant::ul/li[1]/a";
	String MYCHANNELS_CATEGORIES_LABEL_XPATH = "//div[@id='content-wrap']/descendant::nav[@class='view-type']/descendant::ul/li[2]/a";
	String MYCHANNEL_EMPTY_MESSAGE_XPATH = "//div[@id='seq-row-list']/descendant::div[@class='empty-data empty-msg']";
	String MYCHANNELS_CHANNELS_TITLE_XPATH = "//div[@class='seq-content-list']/descendant::a[contains(@class, 'icn-rows')]";
	String MYCHANNELS_CATEGORIES_TITLE_XPATH = "//div[@class='seq-content-list']/descendant::a[contains(@class, 'icn-tile')]";

	String MYCHANNELPAGE_CHANNELS_NEXTBTN1_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'seq')]/div[";
	String MYCHANNELPAGE_CHANNELS_NEXTBTN2_XPATH = "/descendant::a[contains(@class,'next')]";
	String MYCHANNELPAGE_CHANNELS_PREVBTN_XPATH = "/descendant::a[contains(@class,'prev')]";

	String MYCHANNELS_ROW_LIST_XPATH = "//div[@class='seq-row-list']";
	String MYCHANNELS_CONTENT_SECTION_XPATH = "//div[@id='content-wrap']/descendant::article/section";

	String MYCHANNELS_CHANNELS_XPATH = "//div[@id='seq-row-list']/descendant::div/descendant::h1/descendant::a[contains(@href,'channels')]";

	String MYCHANNELS_CHANNELS_TITLE_PART_ONE_XPATH = "//div[@id='seq-row-list']/descendant::div[";
	String MYCHANNELS_CHANNELS_TITLE_PART_TWO_XPATH = "]/descendant::h1/descendant::a[contains(@href,'channels')]";

	// My Account Page
	String MYACCOUNT_ZIP_TXT_XPATH = "//form[@id='update']/descendant::input[contains(@name,'zip')]";
	String MYACCOUNT_SAVE_BTN_XPATH = "//button[@id='user_login']";
	String MYACCOUNT_ZIP_ERROR_MSG_XPATH = "//form[@id='update']/descendant::label[@class='error']";
	String LOGIN_USER_XPATH = "//div[@id='tool-menu']/descendant::div[@class='account']/div";

	// Genre Section
	String GENRECATEGORYNEXTBUTTONPARTONE_XPATH = "//div[@id='genre']/descendant::div[@class='genre-container']/descendant::div[";
	String GENRECATEGORYNEXTBUTTONPARTTWO_XPATH = "]/descendant::a[contains(@class, 'next')]";
	String GENRECATEGORYDETAILLABLE_XPATH = "//div[@id='content-wrap']/descendant::h1[1]";
	String GENRECATEGORYDETAILTITLE_XPATH = "//div[@id='content-wrap']/descendant::h2[1]";
	String GENRECATEGORYTYPELABLE_XPATH = "//div[@id='content-wrap']/descendant::header[@class='content-list-header']/descendant::li[1]/a";
	String GENRES_TYPE_HEADER_LABEL_XPATH = "//div[@class='seq-content-list']/descendant::section[@class='view-row']";
	String GENRES_SHOWS_SECTION_XPATH = "//div[@id='genre']/descendant::div[contains(@class,'list')]";

	String FOOTER_GENRES_LISTS_XPATH = "//div[@id='footerCatNav']/descendant::li";
	String GENRES_PAGE_TITLE_XPATH = "//div[@id='content-wrap']/descendant::header[1]/h1";
	String GENRES_PAGE_SHOWS_LIST_XPATH = "//div[@class='seq-content-list']/descendant::div[@class='list1']/descendant::li";

	// Footer
	String FOOTERLOGOTEXT_XPATH = "//div[@id='footerlogo']/descendant::a[contains(@title,'Watchable')]";
	String FOOTERLOGOIMAGE_XPATH = "//div[@id='footerlogo']/descendant::img[contains(@src,'watchable')]";
	String FOOTERCOPYRIGHTID_XPATH = "//div[@id='footercopyright']";
	String FOOTERCATEGORY_XPATH = "//div[@id='footercategory']";

	// Log In
	String LOGINBUTTON_XPATH = "//div[@id='registration-tabs']/descendant::button[@id='user_login']";
	String SIGNUP_EMPTYEMAIL_MESSAGE_XPATH = "//div[@id='registration-tabs']/descendant::label[contains(@for,'username')]";
	String RESET_PASSWORD_ERROR_XPATH = "//div[contains(@class, 'reset-password')]/descendant::label[@class='error']";
	String RESET_PASSWORD_SUBMIT_XPATH = "//div[contains(@class, 'reset-password')]/descendant::button[@class='btn'][@type='submit']";
	String FORGOT_PASSWORD_EMPTYFIELD_WARNINGMSG_XPATH = "//div[@id='registration-tabs']/descendant::label[@class='error']";
	String LOGIN_EMAIL_FIELD_XPATH = "//input[@id='login_username']";
	String LOGIN_PASSWORD_FIELD_XPATH = "//input[@id='login_psd']";
	String LOGIN_PASSWORD_ERROR_XPATH = "//div[@id='registration-tabs']/descendant::label[contains(@for,'login_psd')]";
	String LOGINPAGE_INCORRECT_CREDENTIALS_MSG_XPATH = "//div[@id='content-wrap']/descendant::div[contains(@class,'register')]/ul/label[@class='error']";

	// Video
	String VIDEODETAILSPAGE_XPATH = "//div[@id='content-wrap']/descendant::article[contains(@id,'video')]";
	String VIDEODETAILSPAGE_VIDEOTITLE_XPATH = "//div[@id='content-wrap']/descendant::a[@id='current_show']";
	String VIDEOPLAYORPAUSEBUTTON_XPATH = "//div[@id='playorpause']";
	String VIDEOFORWARDBUTTON_XPATH = "//div[@id='controls_buttons']/descendant::div[@class='next']";
	String VIDEOREWINDBUTTON_XPATH = "//div[@id='controls_buttons']/descendant::div[@class='prev']";
	String VIDEODETAILSPAGETITLE_XPATH = "//div[@class='video-metadata']/descendant::h3[@id='current_title']";
	String VIDEOPAGEYOUAREWATCHINGTITLE_XPATH = "//div[@id='upNext']/descendant::header";
	String VIDEOSTARTPOINTBUTTON_XPATH = "//div[@id='startpoint']";
	String VIDEORESUMEPOINTBUTTON_XPATH = "//div[@id='resumepoint']";
	String VIDEONOWPLAYINGOPOUP_XPATH = "//div[@id='nowplaying']";
	String VIDEOPLAYFROMBUTTON_XPATH = "//div[@class='playoptions']/descendant::div[@id='resumepoint']";
	String VIDEOPLAYSTARTBUTTON_XPATH = "//div[@class='playoptions']/descendant::div[@id='startpoint']";
	String VIDEOFULLSCREENBUTTON_XPATH = "//div[@id='controls_buttons']/descendant::div[@class='full']/descendant::img[contains(@src,'_full')]";
	String VIDEOFULLSCREENRESTOREBUTTON_XPATH = "//div[@id='controls_buttons']/descendant::div[@class='full']/descendant::img[contains(@src,'_restore')]";
	// The VIDEOPLAYER_XPATH denotes the Now Playing video wrapper in the Video
	// details page.
	String VIDEOPLAYER_XPATH = "//div[@id='video-wrapper']/descendant::object[@id='PlayerPlatformAPI']";
	String VIDEOCURRENTPOSITIONLABEL_XPATH = "//div[@id='controls_wrapper']/descendant::div[@id='display']";
	String VIDEODURATIONLABEL_XPATH = "//div[@id='controls_wrapper']/descendant::div[@id='duration']";
	String VIDEOCURRENTLIKESPAN_XPATH = "//div[@class='video-metadata']//descendant::span[@id='current_like']";
	String VIDEOLIKEIMAGE_XPATH = "//div[@id='controls_buttons']//descendant::img[@id='like']";
	String VIDEOLIKEDIMAGE_XPATH = "//div[@id='controls_buttons']//descendant::img[@id='liked']";
	String VIDOLIKEORUNLIKEIMAGE_XPATH = "//div[@id='controls_buttons']//descendant::div[@id='likeorunlike']";
	String VIDEO_DETAILSPAGE_REPORT_IMAGE_XPATH = "//div[@id='controls_buttons']/descendant::img[@id='report']";
	String VIDEO_DETAILSPAGE_REPORTVIDEO_HEADER_XPATH = "//div[@class='reportheader']/descendant::span";
	String VIDEO_REPORTVIDEO_ALERTWITHOUTLOGIN_SPAN_XPATH = "//div[@id='reportVideo']/descendant::div[@id='report-after']/descendant::span[@id='alertcontent']";
	String VIDEO_REPORTVIDEO_ALERTWITHOUTLOGIN_OKBTN_XPATH = "//div[@id='reportVideo']/descendant::div[@id='report-after']/descendant::button[@class='btn']";
	String VIDEODETAILSPAGECONTENT_XPATH = "//div[@id='content-wrap']";
	String VIDEODECURRENTCHANNEL_XPATH = "//a[@id='current_channel']";
	String VIDEODECURRENTVIDEOTITLE_XPATH = "//h3[@id='current_title']";
	String VIDEODETAIL_POPUP_PLAYFROMSTARTBTN_XPATH = "//div[contains(@id,'controls')]/descendant::div[@id='startpoint']";
	String VIDEO_REPORTVIDEO_INCORRECTRATING_RADIO_XPATH = "//div[@id='reportVideo']/descendant::li[5]/descendant::label[@for='reason_5']";
	String VIDEO_REPORTVIDEO_BUTTON_XPATH = "//div[@id='reportVideo']/descendant::button[@id='flagcommit']";
	String VIDEO_VIDEOREPORTED_SPAN_XPATH = "//div[@id='reportVideo']/descendant::div[@class='reportheader']/descendant::span";
	String VIDEO_VIDEOREPORTED_BUTTON_XPATH = "//div[@id='reportVideo']/descendant::button[@class='btn']";

	// Social Media
	String TWEET_BUTTON_XPATH = "//a[@id='b']/i";
	String TWEET_VIDEO_URL_TXT_XPATH = "//textarea[@id='status']";
	String FB_BUTTON_XPATH = "//article[@id='content-video']/descendant::img[contains(@src,'facebookshare')]";

	// Common
	String CHANNELSHOWLINK_XPATH = "/descendant::h1/a";
	String PAGINATIONNEXTBUTTON_XPATH = "//div[@id='popular_channels']/descendant::a[contains(@class,'next')]";
	String JOIN_WATCHABLE_XPATH = "//div[@id='content-wrap']/descendant::header/h1";
	String CHNGPASSWD_SUBMIT_BTN_XPATH = "//div[@id='registration-tabs']/descendant::fieldset/button[@name='commit']";
	String CHANGEPASSWORD_XPATH = "//div[@id='registration-tabs']/descendant::a[contains(@href,'password')]";
	String LIST_XPATH = "/descendant::li";
	String LINK_XPATH = "/descendant::h1";
	String HREF_XPATH = "/a";
	String LINKHREF_XPATH = "/descendant::h1/a";
	String UL_LIST_XPATH = "/descendant::ul/li";
	String HREF_LINK_XPATH = "/descendant::a";

	// Search
	String SEARCH_XPATH = "//input[@id='search-query']";
	String SEARCHBUTTON_XPATH = "//input[@id='go-search']";
	String SEARCHNAVMENU_XPATH = "//div[contains(@id,'menu')]/div[contains(@class,'search')]";
	String EPISODE_SEARCH_XPATH = "//div[@class='seq-content-list']/descendant::section[@class='view-row']";

	// Help
	String HELP_TITLE_XPATH = "//div[@class='footer-info-content']/descendant::h1";

	// Footer
	String FOOTER_WATCHABLE_TITLE_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerplatform']/descendant::div[@class='navtitle']";
	String FOOTER_SIGNUP_AFTERLOGIN_SPAN_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerplatform']/descendant::li[1]";
	String FOOTER_WATCHABLEFORIPAD_LINK_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerplatform']/descendant::a[contains(@href,'ipad')]";
	String FOOTER_WATCHABLEFORTV_LINK_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerplatform']/descendant::a[contains(@href,'xfinity')]";
	String FOOTER_HELP_LINK_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerplatform']/descendant::a[contains(@href,'help')]";
	String FOOTER_COMPANY_TITLE_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerinfo']/descendant::div[@class='navtitle']";
	String FOOTER_PRIVACYPOLICY_LINK_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerinfo']/descendant::a[contains(@href,'privacy')]";
	String FOOTER_TERMSOFUSE_LINK_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerinfo']/descendant::a[contains(@href,'terms')]";
	String FOOTER_ADCHOICES_LINK_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerinfo']/descendant::a[contains(@href,'adinformation/')]";
	String FOOTER_ADVERTISEWITHUS_LINK_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerinfo']/descendant::a[contains(@href,'comcastspotlight')]";
	String FOOTER_CONTACTUS_LINK_XPATH = "//div[@id='footercontainer']/descendant::div[@id='footerinfo']/descendant::a[contains(@href,'contact')]";
	String FOOTER_SIGNUP_LINK_XPATH = "//div[@id='footerplatform']/descendant::li[1]/a";
	String FOOTER_XPATH = "//div[@id='footercontainer']";

	// Change Password
	String CHANGEPASSWORD_CURRENTPASSWORD_FIELD_XPATH = "//div[@id='registration-tabs']/descendant::input[@id='old_password']";
	String CHANGEPASSWORD_NEWPASSWORD_FIELD_XPATH = "//div[@id='registration-tabs']/descendant::input[@id='password']";
	String CHANGEPASSWORD_CONFIRMPASSWORD_FIELD_XPATH = "//div[@id='registration-tabs']/descendant::input[@name='confirm_password']";
	String CHANGEPASSWORD_SUBMIT_BUTTON_XPATH = "//div[@id='registration-tabs']/descendant::button[@class='btn']";

	// Account
	String ACCOUNT_ZIP_FIELD_XPATH = "//div[@id='registration-tabs']/descendant::input[@name='user[zip]']";

	// ****************************************************************************************************************
	// 								OBJECTS FOR NEW UI DESIGN
	// ****************************************************************************************************************

	// ******************************************** HOME PAGE *********************************************************

	// **************Top Menu
	String watchableTopLogo_XPATH = "//div[@id='headerView']/descendant::li[contains(@class,'img-logo')]/descendant::img[contains(@class,'logo')]";
	String myWatchlistMenu_XPATH = "//div[@id='headerView']/descendant::li[contains(@class,'main-menu')]/descendant::a[3]";
	String allChannelsMenu_XPATH = "//div[@id='headerView']/descendant::li[contains(@class,'main-menu')]/descendant::a[2]";
	String playLists_XPATH = "//div[@id='headerView']/descendant::li[contains(@class,'main-menu')]/descendant::a[1]";
	String loginMenu_XPATH = "//div[@id='headerView']/descendant::li[contains(@class,'tool-menu')]/descendant::a[contains(@class,'log_in')]";
	String signUpMenu_XPATH = "//div[@id='headerView']/descendant::li[contains(@class,'tool-menu')]/descendant::a[contains(@class,'sign_up')]";
	//String profileIcon_XPATH = "//div[@id='headerView']/descendant::li[contains(@class,'tool-menu')]/descendant::li[contains(@class,'dropdown-menu')]/descendant::img";
	String profileIcon_XPATH = "//section[@id='userBarView']/descendant::li[contains(@class,'tool-menu')]/descendant::li[contains(@class,'dropdown-menu')]/descendant::img";
	// String
	// loginUserEmailTitle_XPATH="//div[@id='headerView']/descendant::li[contains(@class,'tool-menu')]/descendant::li[contains(@class,'user_position')]/a";
	//String loginUserEmailTitle_XPATH = "//div[@id='headerView']/descendant::li[@class='tool-menu']/descendant::div[@class='user-profile-container']/descendant::ul/descendant::div/descendant::a";
	String loginUserEmailTitle_XPATH = "//section[@id='userBarView']/descendant::li[@class='tool-menu-L']/descendant::div[@class='user-profile-container']/descendant::ul/descendant::div/descendant::a";
	// String
	// logoutButton_XPATH="//div[@id='headerView']/descendant::li[contains(@class,'tool-menu')]/descendant::li[contains(@class,'user_icon')]/descendant::a";
	String logoutButtonMenu_XPATH = "//section[@id='userBarView']/descendant::li[contains(@class,'tool-menu')]/descendant::li[contains(@class,'user_icon')]";
	String logoutButton_XPATH = "//section[@id='userBarView']/descendant::li[contains(@class,'tool-menu')]/descendant::li[contains(@class,'user_icon')]/descendant::a";
	String headerLogoMenuSeparater_XPATH="//div[@id='headerView']/descendant::li[@class='cutline']";
	String header_XPATH="//div[@name = 'top']/descendant::div[contains(@class,'menu_list')]";
	
	
	
	//************ Home page Social Sharing
	
	String homePageSocialSharingSection_XPATH = "//div[@class='socialIcon']";
	String homePageFaceBookButton_XPATH = "//div[contains(@class,'facebook')]";
	String homePageTwitterButton_XPATH = "//div[contains(@class,'twitter')]";
	String homePageInstagramButton_XPATH = "//div[contains(@class,'instagram')]";
	
	
	

	// *************************************** Body

	// *** Featured Videos
	String playlistsSectionTitle_XPATH = "//div[@id='playlist']/descendant::header";
	String playlistsVideosRow_XPATH = "//div[@id='featured_playlist']";
	String playlistsVideosIcon_XPATH = "//div[@id='featured_playlist']/descendant::li[contains(@class,'featured_playlist')]";
	String playlistsSelectedVideo_XPATH = "//div[@id='featured_playlist']/descendant::li[contains(@class,'selected')]/descendant::h2";
	String playlistsSelectedVideoTitle_XPATH = "//div[@id='featured_playlist']/descendant::li[contains(@class,'selected')]/descendant::h2";
	String playlistsSelectedVideoDesc_XPATH = "//div[@id='featured_playlist']/descendant::li[contains(@class,'selected')]/descendant::p";
	String playlistsSelectedVideoData_XPATH = "//div[@id='featured_playlist']/descendant::li[contains(@class,'selected')]/descendant::div[@class='icon_data']/descendant::div[@class='playlist_data']";
	String playlistsSelectedVideoDetail_XPATH = "//div[@id='featured_playlist']/descendant::li[contains(@class,'selected')]/descendant::h6";
	String playlistsCarousel_XPATH = "//div[@id='featured_playlist']/descendant::div[contains(@class,'jcarousel-')]";
	//String playlistsPlayIcon_XPATH = "//div[@id='featured_playlist']/descendant::div[contains(@class,'play_list_Play_icon')]/descendant::a/img";
	String playlistsGenreButton_XPATH = "//div[@id='featured_playlist']/descendant::div[contains(@class,'channel_title_box')]/descendant::div";
	String playlistsWatchButton_XPATH = "//div[@id='featured_playlist']/descendant::span[contains(@class,'watch_icon_container')]";
	String playlistsPlayIcon_XPATH = "//div[@id='featured_playlist']/descendant::span[@class = 'watch_icon']/descendant::img";
	String featuredSectionTitle_XPATH = "//div[@id='featured']/descendant::header/h1";
	String featuredVideosRow_XPATH = "//div[@id='featured_videos']";
	String featuredVideosIcon_XPATH = "//div[@id='featured_videos']/descendant::div[@class='pic']";
	String featuredFirstVideoTitle_XPATH = "//div[@id='featured_videos']/descendant::h1[3]/a[2]";
	//String featuredFirstVideoTitle_XPATH = "//div[@id='featured_videos']/descendant::h1[2]/a[2]";
	String featuredVideoTitle_XPATH = "//div[@id='featured_videos']/descendant::h1[";
	String featuredVideoDuration_XPATH = "//div[@id='featured_videos']/descendant::div[@class='icon'][";
	//String featuredVideoChannelTitle_XPATH = "//div[@id='featured_videos']/descendant::li[";
	String featuredVideoChannelTitle_XPATH = "//div[@id='featured_videos']/descendant::div[@class='slider']/descendant::li[";
	String featuredVideoLastModified_XPATH = "]/descendant::div[@class='subtitle']";
	String featuredVideoFirstShowTitle_XPATH = "//div[@id='featured_videos']/descendant::li[1]/descendant::div[@class='subtitle']/descendant::a";
	String featuredVideoShowTitle_XPATH = "//div[@id='featured_videos']/descendant::li[";
	String featuredShowLastModified_XPATH ="]/descendant::div[@class='subtitle']";

	// *** Featured Shows
	//String featuredChannelsTitle_XPATH = "//div[@id='popular_channels']/descendant::header/h1";
	String featuredChannelsTitle_XPATH ="(//h1[@class='home'])[2]";
	//String featuredChannelsTitle_XPATH ="//span[text()='shows of the week']";

	String featuredChannelsRow_XPATH = "//div[@id='popular_center']";
	String featuredChannelsIcon_XPATH = "//div[@id='popular_center']/descendant::div[@class='pic']";
	String featuredFirstChannelTitle_XPATH = "//div[@id='popular_center']/descendant::h1[5]/a";
	//String featuredFirstChannelTitle_XPATH = "//div[@id='popular_center']/descendant::h1[4]/a";
	String featuredChannelTitle_XPATH = "//div[@id='popular_center']/descendant::h1[";
	String featuredShowsMoreShowsButton_XPATH ="//div[@id='popular_center']/descendant::a[@class='moreshows'][contains(@href, 'shows')]";

	// *** Genre Section
	String genreChannelsTitle_XPATH = "//div[@id='channels_genre']/descendant::header/descendant::h1";
	String genreChannelsSection_XPATH = "//div[@id='channels_by_genre']/descendant::section[@class='list_container']";
	String genreCategoryRow_XPATH = "//div[@id='channels_genre']/descendant::section[@class='list_container']/descendant::div[contains(@class,'list')]";
	String genreCategoryTitlePartOne_XPATH = "//div[@id='channels_by_genre']/descendant::section/descendant::div[contains(@class,'list";
	String genreCategoryTitlePartTwoe_XPATH = "')]/descendant::h1[1]";
	String genreCategoryChannelIcon_XPATH = "')]/descendant::div[@class='video_container']/descendant::li";
	String genreCategoryChannelCount_XPATH = "')]/descendant::li[";
	String genreCategoryChannelCountOne_XPATH = "]/descendant::h1/a";
	String genreCategoryFirstChannelTitle_XPATH = "//div[@id='channels_by_genre']/descendant::section/descendant::div[contains(@class,'list0')]/descendant::div[@class='video_container']/descendant::li[1]/descendant::h1/a";
	String genreCategoryMoreLink_XPATH = "//div[contains(@id, '2')][@class='expandable']";

	// *************************** Footer
	String footerSection_XPATH = "//div[@class='footer-container']/descendant::li";
	String footer_XPATH = "//ul[@class = 'footer clearfix']";
	//String footerHomeLink_XPATH = "//div[@class='footer-container']/descendant::li[3]/descendant::ul[contains(@class,'inner_footer')]/descendant::li[1]/a";
	String footerHomeLinkHomePage_ID="homeLink";
	String footerHomeLinkOtherPage_XPATH = "//li[@id='homeLink']/a";
	// String
	// footerSignUpLink_XPATH="//div[@class='footer-container']/descendant::li[3]/descendant::ul[contains(@class,'inner_footer')]/descendant::li[2]/a";
	String footerBeforeLoginSignUpLink_XPATH = "//li[@id='signUp']/a";
	String footerAfterLoginSignUpLink_ID = "signUp";
	String footerHelpLink_XPATH = "//div[@class='footer-container']/descendant::li[3]/descendant::ul[contains(@class,'inner_footer')]/descendant::li[2]/a";
	String footerContactUsLink_XPATH = "//div[@class='footer-container']/descendant::li[3]/descendant::ul[contains(@class,'inner_footer')]/descendant::li[3]/a";
	String footerPrivacyPolicyLink_XPATH = "//div[@class='footer-container']/descendant::ul[contains(@class,'inner_footer')]/descendant::li[4]/a";
	String footerTermsOfUseLink_XPATH = "//div[@class='footer-container']/descendant::ul[contains(@class,'inner_footer')]/descendant::li[5]/a";
	String footerAdChoicesLink_XPATH = "//div[@class='footer-container']/descendant::ul[contains(@class,'inner_footer')]/descendant::li[6]/a";
	String footerCopyRightText_XPATH = "//div[@class='footer-container']/descendant::h1";
	//String footerwatchableLogo_XPATH = "//div[@class='footer-container']/descendant::li[contains(@class,'img-logo')]/descendant::a";
	//String footerwatchableLogo_XPATH = "//li[@id='footerLogo']/descendant::a/img";
	String footerwatchableLogo_XPATH = "//li[@id='footerLogo']/descendant::img";

	// ************************************************* LOGIN PAGE ********************************************************

	String loginForm_XPATH = "//section [@id='signInView']/descendant::div[contains(@class,'register-user login')]";
	String loginFormTitle_XPATH = "//section [@id='signInView']/descendant::div[contains(@class,'register-user-wrap')]/header";
	String loginFormCloseButton_XPATH = "//section [@id='signInView']/descendant::div[contains(@class,'register-user login')]/descendant::div[contains(@class, 'close')]";
	String loginFormEmailText_ID = "login_username";
	String loginFormPasswordText_ID = "login_psd";
	String loginFormRememberMeLabel_XPATH = "//form [@id='login']/descendant::div[contains(@class,'rememberMe')]/span";
	//String loginFormRememberMeCheckBox_XPATH = "//label[@id='remember_me_label']";
	String loginFormRememberMeCheckBox_XPATH = "//input[@id='remember_me']";
	String loginFormForgotPassLink_XPATH = "//form[@id='login']/descendant::a";
	String loginFormLoginButton_ID = "user_login";
	String loginError_ID = "error-alert";
	String loginEmailError_XPATH = "//form[@id='login']/descendant::label[@class='error'][@for='login_username']";
	String loginPasswordError_XPATH = "//form[@id='login']/descendant::label[@class='error'][@for='login_psd']";
	String loginUserNameError_XPATH = "//form[@id='login']/descendant::label[@class='error'][@for='login_username']";

	// ************************************************* FORGOT YOUR PASSWORD ********************************************************

	String forgotPasswordForm_XPATH = "//section [@id='signInView']/descendant::div[contains(@class,'register-user login')]";
	String forgotPasswordFormTitle_XPATH = "//section [@id='signInView']/descendant::div[contains(@class,'register-user-wrap')]/header";
	//String forgotPasswordFormCloseButton_XPATH = "//section [@id='signInView']/descendant::div[contains(@class,'register-user login')]/descendant::div[contains(@class, 'close')]";
	String forgotPasswordFormCloseButton_ID = "signin_close_icon";
	String forgotPasswordFormEmailText_ID = "email";
	String forgotPasswordFormContinueButton_ID = "retrieve_psd";
	String forgotPasswordEmailError_XPATH = "//form[@id='reset-pwd']/descendant::label[@class='error'][@for='email']";
	String forgotPasswordInvalidEmailError_XPATH = "//form[@id='reset-pwd']/descendant::label[@class ='error'][@for='email']";
	//String forgotPasswordInvalidEmailError_XPATH = "//form[@id='reset-pwd']/descendant::header[contains(@class,'confirmation')]";
	String forgotPasswordConfirmMsg = "//form[@id='reset-pwd']/descendant::header[contains(@class,'confirmation')]";

	// ************************************************* RESET PASSWORD ********************************************************

	String settingsButtonMenu_XPATH = "//section[@id='userBarView']/descendant::li[contains(@class,'tool-menu')]/descendant::li[@class='settings']";
	String settingsButton_XPATH = "//section[@id='userBarView']/descendant::li[contains(@class,'tool-menu')]/descendant::li[@class='settings']/descendant::a";
	//String settingsButton_XPATH = "//section[@id='userBarView']/descendant::li[contains(@class,'tool-menu')]/descendant::a[contains(@class,'li-user')]";
	String resetPasswordForm_XPATH = "//div[@id='headerView']/descendant::div[contains(@class,'reset_pwd')]/descendant::div[@class='register-user login']";
	String resetPasswordFormTitle_XPATH = "//div[@id='headerView']/descendant::div[contains(@class,'reset_pwd')]/descendant::div[@class='register-user login']/descendant::header";
	//String resetPasswordFormCloseButton_XPATH = "//div[@id='headerView']/descendant::section/descendant::div[contains(@class,'reset_pwd')]/descendant::div[@class='register-user login']/descendant::div[contains(@class, 'close')]";
	String resetPasswordFormCloseButton_XPATH = "//div[contains(@class,'reset_pwd')]/descendant::div[@id='pwd_close_icon']//descendant::img";
	String resetPasswordFormOldPasswordText_ID = "old_pwd";
	String resetPasswordFormNewPasswordText_ID = "newPassword";
	String resetPasswordFormConfirmPasswordText_XPATH = "//form[@id='updatePwd']/descendant::input[@id='confirm_signup_password']";
	String resetPasswordFormUpdateButton_XPATH = "//form[@id='updatePwd']/descendant::button";
	String resetPasswordFormOldPasswordError_XPATH = "//form[@id='updatePwd']/descendant::label[@class='error'][@for='old_pwd']";
	String resetPasswordFormNewPasswordError_XPATH = "//form[@id='updatePwd']/descendant::label[@class='error'][@for='newPassword']";
	String resetPasswordFormConfirmPasswordError_XPATH = "//form[@id='updatePwd']/descendant::label[@class='error'][@for='confirm_signup_password']";
	String resetPasswordFormInvalidOldPasswordError_XPATH = "//div[@id='headerView']/descendant::section/descendant::div[contains(@class,'reset_pwd')]/descendant::div[@class='register-user login']/descendant::header[contains(@class,'error')]";
	String resetPasswordFormConfirmMsg_XPATH = "//div[@id='headerView']/descendant::section/descendant::div[contains(@class,'reset_pwd')]/descendant::div[@class='register-user login']/descendant::header[contains(@class,'confirmation')]";

	// ************************************************* SIGN UP PAGE ********************************************************

	String signUpForm_XPATH = "//div[@id='headerView']/descendant::div[contains(@class, 'sign_up')]/descendant::div[contains(@class, 'register-user login')]";
	String signUpFormTitle_XPATH = "//div[@id='headerView']/descendant::div[contains(@class, 'sign_up')]/descendant::div[contains(@class, 'register-user login')]/descendant::header";
	String signUpFormCloseButton_XPATH = "//div[@id='headerView']/descendant::div[contains(@class, 'sign_up')]/descendant::div[contains(@class, 'close_icon')][@type='submit']";
	String signUpFormMsg_XPATH = "//div[@id='headerView']/descendant::div[contains(@class, 'sign_up')]/descendant::div[contains(@class, 'register-user login')]/descendant::p";
	String signUpFormUserNameText_ID = "username";
	String signUpFormEmailText_ID = "useremail";
	String signUpFormPasswordText_ID = "password";
	String signUpFormConfirmPasswordText_ID = "confirm_signup_password";
	//String signUpFormCaptchaImage_XPATH = "//div[contains(@class,'rc-anchor rc-anchor-normal rc-anchor-dark')]";
	String signUpFormCaptchaImage_XPATH = "//div[@id='recaptcha_holder_signup']/descendant::iframe";
	String signUpFormCaptchaReload_XPATH = "//div[@id='recaptcha_holder']/descendant::img[contains(@src, 'reload')]";
	String signUpFormCaptchaAudio_XPATH = "//div[@id='recaptcha_holder']/descendant::img[contains(@src, 'audio')]";
	String signUpFormCaptchaHelp_XPATH = "//div[@id='recaptcha_holder']/descendant::img[contains(@src, 'help')]";
	String signUpFormCaptchaText_ID = "recaptcha_response_field";
	//String signUpFormTermsCheckBox_XPATH = "//form[@id='signup']/descendant::div[@class= 'checkboxFive']/descendant::input[contains(@type, 'checkbox')]";
	String signUpFormTermsCheckBox_XPATH = "//form[@id='signup']/descendant::div[@class= 'checkboxFive']/descendant::input[contains(@id, 'terms_conditions')]";
	String signUpFormTermsConditionLink_ID = "terms_conditions_link";
	String signUpFormTermsOfServiceLink_XPATH = "//form[@id='signup']/descendant::div[contains(@class,'terms_conditions')]/descendant::a[1]";
	String signUpFormPrivacyPolicyLink_XPATH = "//form[@id='signup']/descendant::div[contains(@class,'terms_conditions')]/descendant::a[2]";
	String signUpFormSignupButton_XPATH = "//form[@id='signup']/descendant::button[@id='user_login']";
	String signUpFormUserNameError_XPATH = "//form[@id='signup']/descendant::label[@class='error'][@for='username']";
	String signUpFormEmailError_XPATH = "//form[@id='signup']/descendant::label[@class='error'][@for='useremail']";
	String signUpFormPasswordError_XPATH = "//form[@id='signup']/descendant::label[@class='error'][@for='password']";
	String signUpFormConfPasswordError_XPATH = "//form[@id='signup']/descendant::label[@class='error'][@for='confirm_signup_password']";
	String signUpFormCaptchaError_XPATH = "//form[@id='signup']/descendant::label[@class='error'][contains(@for, 'recaptcha')]";
	//String signUpFormTermsConditionError_XPATH = "//form[@id='signup']/descendant::label[@class='error'][@for='user[terms_conditions]']";
	String signUpFormTermsConditionError_XPATH = "//form[@id='signup']/descendant::label[@class='error'][contains(@for,'terms_conditions')]";
	String reCapchaHelpHeader_XPATH = "//article[contains(@class,'primary-article')]/descendant::h2[1]";
	String termsAndConditionsForm_XPATH = "//div[contains(@class, 'term')]/descendant::div[contains(@class, 'register-user terms')]";
	String termsAndConditionsFormTitle_XPATH = "//div[contains(@class, 'term')]/descendant::header";
	String termsAndConditionsFormCloseButton_XPATH = "//div[contains(@class, 'term')]/descendant::div[contains(@class, 'close_icon')][@type='submit']";
	String termsAndConditionsFormAcceptButton_ID = "terms_conditions_accept";
	String termsAndConditionsFormDeclineButton_ID = "terms_conditions_decline";
	String signUpFormCaptchaText_XPATH = "//div[@id='recaptcha_widget']/descendant::div[contains(@class, 'audio')]/descendant::img";
	String signUpFormCaptchaPlay_ID = "recaptcha_audio_play_again";
	String recaptchaAnchorButton_ID="recaptcha-anchor";
	String recaptchaAnchorButton_XPATH="//span[@id='recaptcha-anchor']/div[5]";
	String recaptchaAnchorLabel_ID="recaptcha-anchor-label";
	String recaptchaLogoImg_XPATH="//div[contains(@class,'anchor')]/descendant::div[contains(@class, 'logo-img')]";
	String recaptchaLogoText_XPATH="//div[contains(@class,'anchor')]/descendant::div[contains(@class, 'logo-text')]";
	String recaptchaPrivacyLink_XPATH="//div[contains(@class,'anchor')]/descendant::a[contains(@href, 'privacy')]";
	String recaptchaTermsLink_XPATH="//div[contains(@class,'anchor')]/descendant::a[contains(@href, 'terms')]";

	// ************************************************* CONTACT US PAGE ********************************************************

	String contactUsForm_XPATH = "//div[@id='headerView']/descendant::div[contains(@class, 'contact_us')]/descendant::div[contains(@class, 'register-user login')]";
	String contactUsFormTitle_XPATH = "//div[@id='headerView']/descendant::div[contains(@class, 'contact_us')]/descendant::div[contains(@class, 'register-user login')]/descendant::header";
	String contactUsFormCloseButton_ID = "contact_close_icon";
	String contactUsFormContactReasonList_ID = "contact_reason";
	String contactUsFormReasonDesc_XPATH = "//div[@id='description']/descendant::textarea[@id='feedback_text']";
	String contactUsFormEmailText_ID = "senderemail";
	String contactUsFormCaptchaImage_ID = "recaptcha_challenge_image";
	//String contactUsFormCaptchaImage_XPATH = "//div[contains(@class,'rc-anchor rc-anchor-normal rc-anchor-dark')]";
	String contactUsFormCaptchaImage_XPATH = "//div[@id='recaptcha_holder_contact']/descendant::iframe";
	String contactUsFormCaptchaText_ID = "recaptcha_response_field";
	String contactUsFormSubmitButton_ID = "user_submit";
	String contactUsFormResetButton_ID = "user_reset";
	String contactUsFormContactReasonError_XPATH = "//form[@id='supportForm']/descendant::label[@class='error'][@for='contact_reason']";
	String contactUsFormReasonDesError_XPATH = "//form[@id='supportForm']/descendant::label[@class='error'][@for='feedback_text']";
	String contactUsFormEmailError_XPATH = "//form[@id='supportForm']/descendant::label[@class='error'][@for='senderemail']";
	String contactUsFormCaptchaError_XPATH = "//form[@id='supportForm']/descendant::label[@class='error'][contains(@for,'recaptcha-response')]";
	String contactUsFormInvalidCaptchaError_ID = "recaptcha_error";

	// ************************************************* HELP PAGE ********************************************************

	String helpForm_XPATH = "//div[contains(@class,'help-info')]";
	String helpFormTitle_XPATH = "//div[contains(@class,'help-info')]/descendant::h1";
	String helpFormQuestionTitle_XPATH = "//div[contains(@class,'help-info')]/descendant::div[@class='section']/descendant::h2";
	String helpFormQuestionsTitle_XPATH = "//div[contains(@class,'help-info')]/descendant::div[@class='section']";

	// ************************************************* PRIVACY POLICY PAGE ********************************************************

	String privacyPolicyForm_XPATH = "//div[contains(@class,'from-legal')]";
	String privacyPolicyFormTitle_XPATH = "//div[contains(@class,'from-legal')]/descendant::h1[1]";
	String privacyPolicyEffectiveDate_ID = "effective";

	// ************************************************* CHANNEL DETAIL PAGE ********************************************************
	String channelPageChannelIcon_XPATH = "//div[@id='channel_section']/descendant::div[@class='channel_img']/descendant::div[contains(@class,'chanelImg')]";
	String channelPageChannelTitle_XPATH = "//div[@id='channel_section']/descendant::h1";
	String channelPageProviderTitle_XPATH = "//div[@id='channel_section']/descendant::h4/a";
	String channelPageChannelDescription_XPATH = "//div[@id='channel_section']/descendant::div[@class='channel_description']/descendant::p[@class='description']";
	String channelPageVideoSectionTitle_XPATH = "//div[@id='featured']/descendant::header";
	String channelPageVideoIcon_XPATH = "//div[@id='featured_videos']/descendant::div[@class='pic']";
	String channelPagePreviousPageButton_XPATH = "//div[@id='featured']/descendant::div[contains(@class,'triangle-left')]";
	String channelPageNextPageButton_XPATH = "//div[@id='featured']/descendant::div[contains(@class,'triangle-right')]";
	String channelPagePageNumberButton_XPATH = "//div[@id='featured']/descendant::li[@class='page_number']";
	String channelPageOtherSectionTitle_XPATH = "//div[@id='popular_channels']/descendant::header/descendant::h1";
	String channelPageOtherSectionChannelRow_XPATH = "//div[@id='featured_channels']/descendant::div[contains(@class,'channel_list')]";
	String channelPageOtherSectionChannelIcon_XPATH = "//div[@id='featured_channels']/descendant::li/descendant::div[@class='pic']";
	String channelPageOtherSectionChannelTitle_XPATH = "//div[@id='featured_channels']/descendant::li[";
	String channelPageOtherSectionProviderTitle_XPATH = "//div[@id='popular_channels']/descendant::header/descendant::h1/a";
	//String channelPagePageVideoNamePartOne_XPATH = "//div[@id='featured_videos']/descendant::li[";
	String channelPagePageVideoNamePartOne_XPATH = "//div[@id='featured_videos']/descendant::div[@class='slider']/descendant::li[";
	//String channelPagePageVideoNamePartTwo_XPATH = "][@class='featured_list']/descendant::h1/a";
	String channelPagePageVideoNamePartTwo_XPATH = "]/descendant::h1/a[2]";
	//String channelPagePageVideoNamePartTwo_XPATH = "]/descendant::span";

	// ************************************************* PROVIDER DETAIL PAGE ********************************************************
	String providerPageProviderIcon_XPATH = "//div[@id='channel_section']/descendant::div[@class='channel_img']/descendant::div[contains(@class,'pic')]";
	String providerPageProviderTitle_XPATH = "//div[@id='channel_section']/descendant::h1";
	String providerPageProviderDescription_XPATH = "//div[@id='channel_section']/descendant::div[@class='channel_description']/descendant::p[@class='description']";
	String providerPageChannelVideoCount_XPATH = "//div[@id='channel_section']/descendant::h4";
	String providerPageChannelSectionTitle_XPATH = "//div[@id='popular_channels']/descendant::header/descendant::h1";
	String providerPageChannelRow_XPATH = "//div[@id='popular_channels']/descendant::div[contains(@class,'channel_list')]";
	String providerPageChannelIcon_XPATH = "//div[@id='popular_channels']/descendant::div[contains(@class,'channel_list')]/descendant::li/descendant::div[@class='pic']";
	String providerPageChannelTitle_XPATH = "//div[@id='popular_channels']/descendant::div[contains(@class,'channel_list')]/descendant::li[";

	// ************************************************* SEARCH PAGE ********************************************************
	String searchButton_XPATH = "//div[@id='headerView']/descendant::li[contains(@class,'search')]/descendant::div[contains(@class,'search_btn')]";
	String searchText_XPATH = "//div[@id='headerView']/descendant::li[contains(@class,'search')]/descendant::input[contains(@class,'search')]";
	String searchResultChannelRow_XPATH = "//div[@id='channel_results']/descendant::div[contains(@class,'channel_list')]";
	String searchResultChannelIcon_XPATH = "//div[@id='channel_results']/descendant::div[contains(@class, 'pic')]";
	String searchResultTChannelTitle_XPATH = "//div[@id='channel_results']/descendant::li[";
	String searchResultVideoRow_XPATH = "//div[@id='video_results']/descendant::section[contains(@class, 'videos')]";
	String searchResultVideoIcon_XPATH = "//div[@id='video_results']/descendant::div[contains(@class, 'pic')]";
	String searchResultVideoTitle_XPATH = "//div[@id='video_results']/descendant::li[";
	String searchResultTitle_XPATH = "//div[@id='featured']/descendant::header";
	String searchNoResultTitle_XPATH = "//div[@id='error_section']/descendant::h1[@class='empty_msg']";
	String searchNoResultHomeLink_XPATH = "//div[@id='error_section']/descendant::header[@class='sub_error']/a";
	String searchNoResultPopulaVideoTitle_XPATH = "//div[@id='popular_channels']/descendant::header/descendant::h1";
	String searchResultTChannelLabel_XPATH = "//div[@id='channel_results']/descendant::div[contains(@class,'left')]/descendant::h1";
	String searchResultTVideoLabel_XPATH = "//div[@id='video_results']/descendant::div[contains(@class,'left')]/descendant::h1";
	String searchResultTPopularVideosRow_XPATH = "//div[@id='featured_videos']/descendant::section[contains(@class,'featured-videos')]";
	String searchResultFirstVideoTitle_XPATH = "//div[@id='video_results']/descendant::li[1]/descendant::h1/a[2]";
	String searchResultShowAllLink_XPATH="//div[@id='expandable']/a";
	String searchResultFirstShowTitle_XPATH="//div[@id='channel_results']/descendant::li[1]/descendant::h1/a";
	String searchResultFirstVideoShowTitle_XPATH="//div[@id='video_results']/descendant::li[1]/descendant::div[@class='subtitle']/descendant::a";

	// ************************************************* MY SHOWS PAGE ********************************************************
	String myWatchlistPageTitle_XPATH="//div[@id='popular_channels']/descendant::header/h1";
	//String myWatchlistVideoIcon_XPATH = "//div[@id='featured_channels']/descendant::li/descendant::div[@class='pic']";
	String myWatchlistVideoIcon_XPATH = "//div[@id='featured_channels']/descendant::div[@class='video_container']/descendant::li/descendant::div[@class='pic']";
	String myWatchlistFirstVideoTitle_XPATH = "//div[@id='featured_channels']/descendant::li[1]/descendant::h1/a[2]";
	String myWatchlistChannelCount_XPATH = "//div[@id='featured_channels']/descendant::div[contains(@class, 'header')]/descendant::h1";
	//String myWatchlistChannelTitlePartOne_XPATH="//div[@id='featured_channels']/descendant::div[contains(@class, 'video_list')]/div[";
	String myWatchlistChannelTitlePartOne_XPATH="//div[@id='featured_channels']/descendant::div[contains(@class, 'video_list')]/descendant::div[contains(@class,'list";
	//String myWatchlistChannelTitlePartTwo_XPATH="]/descendant::div[contains(@class, 'header')]/descendant::h1";
	String myWatchlistChannelTitlePartTwo_XPATH="')]/descendant::div[contains(@class, 'header')]/descendant::h1/a";
	String myWatchlistGoToChannelLinkPartOne_XPATH="//div[@id='featured_channels']/descendant::div[contains(@class, 'video_list')]/div[";
	String myWatchlistGoToChannelLinkPartTwo_XPATH="]/descendant::div[contains(@class, 'right')]/descendant::h2/a";
	String myWatchlistGoToChannelLink_XPATH="//div[@id='featured_channels']/descendant::div[contains(@class, 'header')]/descendant::h2/a";
	String myWatchlistPageErrorTitle_XPATH="//div[@id='error_section']/descendant::div/descendant::header/h1";
	String myWatchlistPageErrorSubTitle_XPATH="//div[@id='error_section']/descendant::header[@class = 'sub_error']";
	//String myShowsPageFirstVideoShowTitle_XPATH="//div[@id='featured_channels']/descendant::li[1]/descendant::div[@class='subtitle']/descendant::a";
	String myShowsPageFirstVideoShowTitle_XPATH="//div[@id='featured_channels']/descendant::div[contains(@class,'video_list')]/descendant::div[1]/descendant::div[contains(@class, 'header')]/descendant::h1/descendant::a";
	String myShowsPageVideoTitlePartOne_XPATH="//div[@id='featured_channels']/descendant::div[@class='video_container']/descendant::li[";
	String myShowsPageVideoTitlePartTwo_XPATH="]/descendant::h1";
	String myShowsPageShowTitleLastUpdatedPartOne_XPATH="//div[@id='featured_channels']/descendant::li[";
	String myShowsPageShowTitleLastUpdatedPartTwo_XPATH="]/descendant::div[@class='subtitle']";
	String myShowsPageFirstShowTitle_XPATH="//div[@id='featured_channels']/descendant::div[2]/descendant::div[1]/descendant::h1[1]/descendant::a";

	// ************************************************* VIDEO PAGE ********************************************************
	//String videoPlayer_ID = "videoContainer_flash_api";
	String videoPlayer_ID = "video-wrapper-container";
	String playFromStartButton_ID="startpoint";
	String playFromResumeButton_ID="resumepoint";
	String playerPlayButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='play']";
	String playerpauseButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='pause']";
	String playerRewindButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='rewind']";
	String playerDisplayButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='display']";
	String playerScrubberButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='scrubber']";
	String playerDurationButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='duration']";
	String playerVolumeButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='vol']";
	String playerShareButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='share']";
	String playerLikeButton_XPATH="//div[contains(@id,'player')]/descendant::li[contains(@class,'like')]";
	String playerUnfollowButton_XPATH="//div[contains(@id,'player')]/descendant::li[contains(@class,' unfollow ')]";
	String playerFollowButton_XPATH="//div[contains(@id,'player')]/descendant::li[contains(@class,'follow')]";
	//String playerFollowButton_XPATH="//div[@id ='channel_section']/descendant::span[@class ='follow_button']/descendant::a[contains(@class,'Subscribe')]";
	String playerFullscreenButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='fullscreen']";
	String playerMoreButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='more']";
	String playingVideoTitle_XPATH="//div[@id='channel_section']/descendant::div[@class='video_description']/h1";
	String playingVideoChannelTitle_XPATH="//div[@id='channel_section']/descendant::div[@class='video_description']/descendant::h4/a";
	String playingVideoChannelDesc_XPATH="//div[@id='channel_section']/descendant::div[@class='video_description']/descendant::p";
	//String playingVideoChannelTitle_XPATH="//div[@id='featured_videos']/descendant::li[1]/descendant::div[@class='subtitle']/descendant::a";
	//String playerReportButton_XPATH="//div[contains(@id,'player')]/descendant::li[@class='more']/descendant::ul[@class='content']/li";
	String playerReportButton_XPATH="//li[@id='report']";
	String reportVideopPopup_ID = "reportVideo";
	String reportVideopReasonRadioButton_XPATH = "//div[@id='report-before']/descendant::li[1]/label";
	String reportVideopSubmitButton_ID = "flagcommit";
	String reportVideopSuccessMsg_ID = "report-after";
	String reportVideopCancelButton_XPATH = "//div[@id='report-before']/descendant::button[2]";
	String nowPlayingTitle_XPATH="//div[@id='nowplaying']/descendant::header";
	String bandwidthDisplay_ID="bandwidth_display";
	String playerVideoContainer_XPATH="//div[@id='videoContainer']";
	String playerContainer_XPATH="//div[@id='player_container']";
	String videoPageShowLogo_XPATH="//div[@id='channel_section']/descendant::img";
	String videoPageUpNexSectionShowTitle_XPATH="//div[@id='ch_metadata_container']/descendant::a";
	String videoPageUpNexSectionVideoIcon_XPATH="//div[@id='featured_videos']/descendant::li";
	String videoPageVideoMetadata_XPATH="//div[@id='channel_section_top']/descendant::section";
	String videoPagePlaylistDetails_XPATH="//div[@id='pl_metadata_container']/descendant::h1";
	String videoPageUpNexSectionNextButton_XPATH="//div[@id='featured_videos']/descendant::div[contains(@class, 'triangle-right')]";
	String videoPageUpNexSectionPreviousButton_XPATH="//div[@id='featured_videos']/descendant::div[contains(@class, 'triangle-left')]";
	
	
	// ************************************************* FOLLOW ********************************************************
	
	String followButton_XPATH = "//div[@id='channel_section']/descendant::span[@class='follow_button_showPage']/descendant::div[contains(@class,'Subscribe')]/a";
	String followVideoPageButton_XPATH = "//div[@id='channel_section']/descendant::span[contains(@class,'follow_button')]/descendant::div[contains(@class,'Subscribe')]/a";
	String followSuccessMsg_XPATH="//div[@id='channel_section']/descendant::span[@class='follow_button']/descendant::div[@class = 'follow_tip flag']";
	String unFollowSuccessMsg_XPATH="//div[@id='channel_section']/descendant::span[@class='follow_button']/descendant::div[contains(@class,'unfollow_tip')]";
	String unFollowChannel_XPATH="//div[@id='channel_section']/descendant::span[@class='follow_button']/descendant::div[contains(@class,'unfollow_tip')]/span";
	String unFollowCancelButton_XPATH="//div[@id='channel_section']/descendant::div[contains(@class,'unfollow_tip')]/descendant::a[contains(@class,'cancel')]";
	String unFollowConfirmButton_XPATH="//div[@id='channel_section']/descendant::div[contains(@class,'unfollow_tip')]/descendant::a[contains(@class,'confirm')]";
	String unFollowButton_XPATH = "//div[@id='channel_section']/descendant::span[@class='follow_button_showPage']/descendant::a[contains(@class,' unfollow')]";
	
	
	
	// ************************************************* SOCIAL SHARRING ********************************************************
	
	String socialShareTitle_XPATH="//div[@id='channel_section']/descendant::ul[@class='share_list']/descendant::li[@class='label']";
	String facebookButton_ID="facebook";
	//String twitterButton_XPATH="//div[@id='channel_section']/descendant::ul[@class='share_list']/descendant::a[contains(@href,'twitter')]";
	String twitterButton_ID="twitter";
	String copyUrlButton_XPATH="//object[@id='global-zeroclipboard-flash-bridge']/embed";
	String emailButton_ID="emailLink";
	//String videoControlFacebookButton_ID="facebook_share";
	String videoControlFacebookButton_XPATH="//div[@id='player_container']/descendant::li[@class='share']/descendant::li[1]";
	//String videoControltwitterButton_XPATH="//div[@id='player_container']/descendant::li[@class='share']/descendant::a[contains(@href,'twitter')]";
	String videoControltwitterButton_XPATH="//div[@id='player_container']/descendant::li[@class='share']/descendant::li[2]";
	//String videoControlemailButton_ID="emailLink";
	String videoControlemailButton_XPATH="//div[@id='player_container']/descendant::li[@class='share']/descendant::li[3]";
	String tweetVideoUrlText_XPATH = "//textarea[@id='status']";
	//String emailSharingForm_XPATH="//div[@id='headerView']/descendant::section[5]/descendant::div[contains(@class, 'email_video')]/descendant::div[@class = 'register-user login']";
	String emailSharingForm_XPATH="//div[@id='headerView']/descendant::div[@class= 'dialog_box_container email_video ']/descendant::div[@class = 'register-user login']";
	String emailPopupTitle_XPATH="//div[@id='headerView']/descendant::div[@class= 'dialog_box_container email_video ']/descendant::header[1]";
	String emailPopupClosoButton_XPATH="//div[@id='headerView']/descendant::div[@class= 'dialog_box_container email_video ']/descendant::div[contains(@class,'close_icon')]/descendant::img";
	String emailPopupFromEmailText_ID="from_email";
	String emailPopupFromEmailText_XPATH="//div[@class= 'dialog_box_container email_video ']/descendant::input[@id='from_email']";
	String emailPopupToEmailText_ID="to_email";
	String emailPopupToEmailText_XPATH="//div[@class= 'dialog_box_container email_video ']/descendant::input[@id='to_email']";
	String emailPopupMessageText_ID="msg";
	String emailPopupMessageText_XPATH="//div[@class= 'dialog_box_container email_video ']/descendant::textarea[@id='msg']";
	String emailPopupSendButton_XPATH="//div[contains(@id,'step')]/descendant::fieldset[@class='emailThisVideo_button']/descendant::button";
	String emailPopupFromEmailErrMsg_XPATH="//form[@id='emailVideo']/descendant::label[@class= 'error'][@for='from_email']";
	String emailPopupToEmailErrMsg_XPATH="//form[@id='emailVideo']/descendant::label[@class= 'error'][@for='to_email']";
	String emailPopupMessageErrMsg_XPATH="//form[@id='emailVideo']/descendant::label[@class= 'error'][@for='msg']";
	String emailPopupConfirmationMsg_XPATH="//div[@class= 'dialog_box_container email_video ']/descendant::header[contains(@class,'confirmation')]";
	
	
	// ************************************************* ALL PLAY LISTS PAGE ********************************************************
	
	String allPlaylistsTitle_XPATH = "//div[@id='playlist']/descendant::header/descendant::h1";
	String allPlaylistsIcon_XPATH = "//div[@id='featured_playlist']/descendant::li";
	String playlistGenreButton_XPATH = "//div[@id='featured_playlist']/descendant::li[1]/descendant::div[@class = 'genre_box']";
	String playlistGenreButtons_XPATH = "//div[@id='featured_playlist']/descendant::li/descendant::div[@class = 'genre_box']";
	String playlistWatchLink_XPATH = "//div[@id='featured_playlist']/descendant::li[1]/descendant::span[contains(@class,'watch_icon_container')]";
	String playlistPlayIcon_XPATH = "//div[@id='featured_playlist']/descendant::div[@class='genre list0']/descendant::img[2]";
	String playlistTitle_XPATH = "//div[@id='featured_playlist']/descendant::li[1]/descendant::h2";
	String playlistDesc_XPATH = "//div[@id='featured_playlist']/descendant::li[1]/descendant::p";
	String playlistData_XPATH = "//div[@id='featured_playlist']/descendant::div[@class='genre list0']/descendant::div[@class='playlist_data']";
	String playlistVideoDetail_XPATH = "//div[@id='featured_playlist']/descendant::li[1]/descendant::h6";
	String playlistFirstIcon_XPATH = "//div[@id='featured_playlist']/descendant::li[1]";
	String playlistShareButton_XPATH = "//div[@id='pl_metadata_container']/descendant::li[@class='sharelink']";
	String playlistShareUrl_XPATH = "//object[@id='global-zeroclipboard-flash-bridge']/descendant::embed";
	//String playlistShareUrl_XPATH = "//embed[@name='global-zeroclipboard-flash-bridge']";
	String playlistShareEmail_ID = "emailSharePL";
	String playlistShareFB_ID = "fbSharePL";
	String playlistShareTW_ID = "twSharePL";
	String playlistemailShareForm_XPATH="//div[@id='headerView']/descendant::div[contains(@class, 'email_video_pl')]/descendant::div[@class = 'register-user login']";
	String playlistemailShareFormCloseButton_XPATH="//div[@id='headerView']/descendant::div[contains(@class, 'email_video_pl')]/descendant::div[contains(@class,'close_icon')]/descendant::img";
	String playlistPopupTitle_XPATH = "//div[@id='headerView']/descendant::div[contains(@class, 'email_video_pl')]/descendant::header[1]";
	String playlistPopupMessageText_XPATH="//form[@id='emailVideo_pl']/descendant::textarea[@id='msg_pl']";
	String playlistPopupFromEmailText_XPATH="//form[@id='emailVideo_pl']/descendant::input[@id='from_email']";
	String playlistPopupToEmailText_XPATH="//form[@id='emailVideo_pl']/descendant::input[@id='to_email']";
	String playlistPopupSendButton_XPATH="//form[@id='emailVideo_pl']/descendant::button[contains(@class, 'btn')]";
	String playlistPopupConfirmationMsg_XPATH="//div[@id='headerView']/descendant::div[contains(@class, 'email_video_pl')]/descendant::header[contains(@class,'email_video')]";
	String playlistPopupFromEmailErrMsg_XPATH="//form[@id='emailVideo_pl']/descendant::label[@for='from_email']";
	String playlistPopupToEmailErrMsg_XPATH="//form[@id='emailVideo_pl']/descendant::label[@for='to_email']";
	String playlistPopupMessageErrMsg_XPATH="//form[@id='emailVideo_pl']/descendant::label[@for='msg_pl'][@class='error']";
	
	
	
	// ************************************************* PAGE NOT FOUND PAGE ********************************************************
	
	String pageNotFoundPageHeading_XPATH="//div[@id='error_section']/descendant::h1";
	String pageNotFoundHomeLink_XPATH="//div[@id='error_section']/descendant::header[@class='sub_error']/descendant::a";
	String pageNotFoundContactUsLink_XPATH="//div[@id='error_section']/descendant::a[@class='contact_us_icon']";
	String pageNotFoundVideoSectionTitle_XPATH="//div[@id='popular_channels']/descendant::header/h1";
	String pageNotFoundVideoSectionIcon_XPATH="//div[@id='featured_videos']/descendant::li[contains(@class,'featured_list')]/descendant::img";
	String pageNotFoundFirstVideoTitle_XPATH="//div[@id='featured_videos']/descendant::li[1]/descendant::h1/descendant::a[2]";
	String pageNotFoundFirstShowTitle_XPATH="//div[@id='featured_videos']/descendant::li[1]/descendant::div[@class='subtitle']/descendant::a";
	
	
	// ************************************************* ALL CHANNEL PAGE ********************************************************
		
	String allShowsPageVideoIcon_XPATH = "//div[@id='channels_by_genre']/descendant::a[@class='logo']";

}
