package comcast.test.testSuite;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import comcast.test.app.testCases.allChannels.VerifyClickOnFooterWatchableLogoFromAllShowsPageNavigatesHomePage;
import comcast.test.app.testCases.allChannels.VerifyClickOnHomeFooterLinkFromAllShowsPageNavigatesHomePage;
import comcast.test.app.testCases.allChannels.VerifyClickOnWatchableLogoFromAllShowsPageNavigatesHomePage;
import comcast.test.app.testCases.allChannels.VerifyDisplayOfHeaderAndFooterInShowByGenrePage;
import comcast.test.app.testCases.allChannels.VerifyUserNavigatingToHomePageLogoutFromAllShowsPage;
import comcast.test.app.testCases.allChannels.VeriyAllChannelsPage;
import comcast.test.app.testCases.allChannels.VeriyAllChannelsTitle;
import comcast.test.app.testCases.allChannels.VeriyAllShowsPageTitle;
import comcast.test.app.testCases.allChannels.VeriyDataDisplayingInAllChannelsPage;
import comcast.test.app.testCases.allChannels.VeriyNavigatingToShowsPageFromShowsByGenrePage;
import comcast.test.app.testCases.channelPage.VerifyChannelDetailPageContent;
import comcast.test.app.testCases.channelPage.VerifyChannelDetailPageVideoSectionContent;
import comcast.test.app.testCases.channelPage.VerifyChannelPageTitle;
import comcast.test.app.testCases.channelPage.VerifyClickOnWatchableLogoFromShowPageNavigatesHomePage;
import comcast.test.app.testCases.channelPage.VerifyClickingOnFooterWatchableLogoFromShowPageNavigatesHomePage;
import comcast.test.app.testCases.channelPage.VerifyClickingOnHomeFooterLinkFromShowPageNavigatesHomePage;
import comcast.test.app.testCases.channelPage.VerifyDisplayOfHeaderAndFooterInShowPage;
import comcast.test.app.testCases.channelPage.VerifyNavigationToChannelPage;
import comcast.test.app.testCases.channelPage.VerifyNavigationToChannelPageFromFeaturedShows;
import comcast.test.app.testCases.channelPage.VerifyNavigationToProviderPageFromOtherChannelsSection;
import comcast.test.app.testCases.channelPage.VerifyNextButton;
import comcast.test.app.testCases.channelPage.VerifyOtherChannelsSectionContent;
import comcast.test.app.testCases.channelPage.VerifyPreviousButton;
import comcast.test.app.testCases.channelPage.VerifyShowIconDisplayingInShowPage;
import comcast.test.app.testCases.channelPage.VerifyUserNavigatingToHomePageLogoutFromShowsPage;
import comcast.test.app.testCases.channelPage.VerifyingClickOnChannlFromOtherChannelsSection;
import comcast.test.app.testCases.channelPage.VeriyVideoLastUpdatedInChannelPage;
import comcast.test.app.testCases.contactUs.ValidateCaptchaByEnteringInvalidKey;
import comcast.test.app.testCases.contactUs.VerifyContactUsFormCloseButton;
import comcast.test.app.testCases.contactUs.VerifyContactUsMandatoryFields;
import comcast.test.app.testCases.contactUs.VerifyEmailByEnteringInvalidValue;
//import comcast.test.app.testCases.contactUs.VerifyResetButtonFunctionality;
import comcast.test.app.testCases.contactUs.VeriyContactUsCaptchaButton;
import comcast.test.app.testCases.contactUs.VeriyContactUsCaptchaPrivacyLink;
import comcast.test.app.testCases.contactUs.VeriyContactUsCaptchaTermsLink;
import comcast.test.app.testCases.contactUs.VeriyContactUsEmailFieldPopulatedWithEmailLoginWithEmail;
import comcast.test.app.testCases.contactUs.VeriyContactUsEmailFieldPopulatedWithEmailLoginWithUserName;
import comcast.test.app.testCases.contactUs.VeriyContactUsHiddenFields;
import comcast.test.app.testCases.contactUs.VeriyContactUsPageContent;
import comcast.test.app.testCases.contactUs.VeriyMessageEmailFieldDisplayedSelectingReason;
import comcast.test.app.testCases.follow.VerifyFollowButtonLabelAfterSuccessfulFollow;
import comcast.test.app.testCases.follow.VerifyFollowButtonLabelAfterSuccessfulUnFollow;
import comcast.test.app.testCases.follow.VerifyFollowConfirmationPopupDisplay;
import comcast.test.app.testCases.follow.VerifyFollowFromChannelPageAfterLogin;
import comcast.test.app.testCases.follow.VerifyFollowFromChannelPageWithoutLogin;
import comcast.test.app.testCases.follow.VerifyFollowFromVideoControlAfterLogin;
import comcast.test.app.testCases.follow.VerifyFollowFromVideoControlWithoutLogin;
import comcast.test.app.testCases.follow.VerifyFollowFromVideoPageAfterLogin;
import comcast.test.app.testCases.follow.VerifyFollowFromVideoPageWithoutLogin;
import comcast.test.app.testCases.follow.VerifyUnfollowConfirmationPopupDisplay;
import comcast.test.app.testCases.follow.VerifyUnfollowFromChannelPage;
import comcast.test.app.testCases.follow.VerifyUnfollowFromVideoPage;
import comcast.test.app.testCases.follow.VerifyUnfollowFromVideoPlayerControls;
import comcast.test.app.testCases.footerLink.VerifyAdChoicesLink;
import comcast.test.app.testCases.footerLink.VerifyAdChoicesLinkTitle;
import comcast.test.app.testCases.footerLink.VerifyClickOnWatchableLogoFromHelpPageNavigatesHomePage;
import comcast.test.app.testCases.footerLink.VerifyClickingOnHomeFooterLinkFromHelpPageNavigatesHomePage;
import comcast.test.app.testCases.footerLink.VerifyClickingOnHomeFooterLinkNavigatesHomePage;
import comcast.test.app.testCases.footerLink.VerifyCopyRightText;
import comcast.test.app.testCases.footerLink.VerifyDisplayOfHeaderAndFooterInHelpPage;
import comcast.test.app.testCases.footerLink.VerifyHelpLink;
import comcast.test.app.testCases.footerLink.VerifyHelpLinkTitle;
import comcast.test.app.testCases.footerLink.VerifyHelpPageTitle;
import comcast.test.app.testCases.footerLink.VerifyPrivacyPolicyLink;
import comcast.test.app.testCases.footerLink.VerifyPrivacyPolicyLinkTitle;
import comcast.test.app.testCases.footerLink.VerifyTermsOfUseLink;
import comcast.test.app.testCases.footerLink.VerifyTermsOfUseLinkTitle;
import comcast.test.app.testCases.footerLink.VerifyUserNavigatingToHomePageLogoutFromHelpPage;
import comcast.test.app.testCases.homePage.VerifyAllHomeCategoriesAreDisplayed;
import comcast.test.app.testCases.homePage.VerifyClickingOnWatchableFooterLogoNavigatesHomePage;
import comcast.test.app.testCases.homePage.VerifyClickingOnWatchableHeaderLogoNavigatesHomePage;
import comcast.test.app.testCases.homePage.VerifyDataDisplayingInAllHomePageSections;
import comcast.test.app.testCases.homePage.VerifyDisplayOfCopyRightTextInFooter;
import comcast.test.app.testCases.homePage.VerifyEightChannelsDisplayedInFeaturedShowSection;
import comcast.test.app.testCases.homePage.VerifyEightVideosDisplayedInFeaturedVideosSection;
import comcast.test.app.testCases.homePage.VerifyFaceBookSharingFromHomePage;
import comcast.test.app.testCases.homePage.VerifyFeaturedChannelsAreDisplayed;
import comcast.test.app.testCases.homePage.VerifyFeaturedPlaylistsAreDisplayed;
import comcast.test.app.testCases.homePage.VerifyFeaturedShowSectionContainsMoreShowsButton;
import comcast.test.app.testCases.homePage.VerifyFeaturedVideosAreDisplayed;
import comcast.test.app.testCases.homePage.VerifyFooterHomeLinkNotClickableInHomePage;
import comcast.test.app.testCases.homePage.VerifyFooterWatchableLogoNotClickableInHomePage;
import comcast.test.app.testCases.homePage.VerifyFooterlinksWithLogin;
import comcast.test.app.testCases.homePage.VerifyFooterlinksWithoutLogin;
import comcast.test.app.testCases.homePage.VerifyGenreButtonDisplayedInFeaturedPlaylistsVideos;
import comcast.test.app.testCases.homePage.VerifyHeaderLogoMenuSeparaterDisplay;
import comcast.test.app.testCases.homePage.VerifyHeaderWatchableLogoNotClickableInHomePage;
import comcast.test.app.testCases.homePage.VerifyHeaderlinksWithLogin;
import comcast.test.app.testCases.homePage.VerifyHeaderlinksWithoutLogin;
import comcast.test.app.testCases.homePage.VerifyHomeFooterLinkNotClickabeInHomePage;
import comcast.test.app.testCases.homePage.VerifyHomePageTitle;
import comcast.test.app.testCases.homePage.VerifyInstagramSharingFromHomePage;
import comcast.test.app.testCases.homePage.VerifyMoreLinkDisplayedInGenreShowSection;
import comcast.test.app.testCases.homePage.VerifyNavigatingToAllShowsPageClickingOnMoreShowsButton;
import comcast.test.app.testCases.homePage.VerifyPlayIconDisplayedInFeaturedPlaylistsVideos;
import comcast.test.app.testCases.homePage.VerifyPresenceOfSocialSharingOptionsInHomePage;
import comcast.test.app.testCases.homePage.VerifySearchTextBoxBehaviour;
import comcast.test.app.testCases.homePage.VerifySearchTextBoxHiddenByDefault;
import comcast.test.app.testCases.homePage.VerifySelectedVideoDetailsInFeaturedPlaylists;
import comcast.test.app.testCases.homePage.VerifySignupButtonIsSelectedByDefault;
import comcast.test.app.testCases.homePage.VerifySixVideosDisplayedInFeaturedPlaylistsSection;
import comcast.test.app.testCases.homePage.VerifyTwitterSharingFromHomePage;
import comcast.test.app.testCases.homePage.VerifyWatchButtonDisplayedInFeaturedPlaylistsVideos;
import comcast.test.app.testCases.homePage.VerifyWatchableLogoNotClickabeInHomePage;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableUsingDigits;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableUsingInValidPassword;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableUsingInValidUserName;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableUsingJavaScript;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableUsingSQLKeyWords;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableUsingSQLStatement;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableUsingSpecialCharacters;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableWithBlankUserName;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableWithInValidCredentials;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableWithInValidUserName;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableWithInvalidLengthUserName;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableWithNonExistingUserName;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableWithValidCredentials;
import comcast.test.app.testCases.loginPageAndLogin.LoginToWatchableWithValidUserName;
import comcast.test.app.testCases.loginPageAndLogin.ValidateChangePassByEnteringCurrentPassword;
import comcast.test.app.testCases.loginPageAndLogin.ValidateCurrentPasswordWhenChangingPassword;
import comcast.test.app.testCases.loginPageAndLogin.ValidateNewPasswordAndConfirmPasswordMatch;
import comcast.test.app.testCases.loginPageAndLogin.ValidateRememberMeFunctionality;
import comcast.test.app.testCases.loginPageAndLogin.VerifyChangePasswordFunctionality;
import comcast.test.app.testCases.loginPageAndLogin.VerifyChangePasswordMandatoryFields;
import comcast.test.app.testCases.loginPageAndLogin.VerifyChangePasswordPageDetailsWithEmptyFields;
import comcast.test.app.testCases.loginPageAndLogin.VerifyForgotPasswordFormCloseButton;
import comcast.test.app.testCases.loginPageAndLogin.VerifyForgotPasswordFunctionalityWithNoEmail;
import comcast.test.app.testCases.loginPageAndLogin.VerifyForgotPasswordFunctionalityWithValidEmail;
import comcast.test.app.testCases.loginPageAndLogin.VerifyForgotPasswordPageDetailsWithEmptyFields;
import comcast.test.app.testCases.loginPageAndLogin.VerifyForgotPasswordWithInValidEmailId;
import comcast.test.app.testCases.loginPageAndLogin.VerifyForgotPasswordWithInValidEmailIdFormat;
import comcast.test.app.testCases.loginPageAndLogin.VerifyLogInFormCloseButton;
import comcast.test.app.testCases.loginPageAndLogin.VerifyLoginPageDetailsWithEmptyFields;
import comcast.test.app.testCases.loginPageAndLogin.VerifyLoginPageDirectURL;
import comcast.test.app.testCases.loginPageAndLogin.VerifyLoginPageMandatoryFields;
import comcast.test.app.testCases.loginPageAndLogin.VerifyLogoutFromWatchable;
import comcast.test.app.testCases.loginPageAndLogin.VerifyRememberMeCheckedByDefault;
import comcast.test.app.testCases.loginPageAndLogin.VerifyResetPasswordFormCloseButton;
import comcast.test.app.testCases.loginPageAndLogin.VerifyUserProfileMenu;
import comcast.test.app.testCases.loginPageAndLogin.VeriyForgotPasswordPageContent;
import comcast.test.app.testCases.loginPageAndLogin.VeriyLogInPageContent;
import comcast.test.app.testCases.loginPageAndLogin.VeriyResetPasswordPageContent;
import comcast.test.app.testCases.misc.VerifyClickOnBacktohomepageLinkFromErrorPageUserNavigatesToHomePage;
import comcast.test.app.testCases.misc.VerifyClickOnContachUsLinkFromErrorPageOpensContactUsForm;
import comcast.test.app.testCases.misc.VerifyClickOnFooterWatchableLogoFromErrorPageUserNavigatesToHomePage;
import comcast.test.app.testCases.misc.VerifyClickOnHomeFooterLinkFromErrorPageUserNavigatesToHomePage;
import comcast.test.app.testCases.misc.VerifyClickOnWatchableLogoFromErrorPageUserNavigatesToHomePage;
import comcast.test.app.testCases.misc.VerifyErrorPageTitle;
import comcast.test.app.testCases.misc.VerifyNavigatingToShowPageFromErrorPage;
import comcast.test.app.testCases.misc.VerifyNavigatingToVideoPageFromErrorPage;
import comcast.test.app.testCases.misc.VerifyPageNotFoundPageContent;
import comcast.test.app.testCases.myWatchlist.VerifyChannelNameDisplayInMyWatchlistPageWhenVideosPresent;
import comcast.test.app.testCases.myWatchlist.VerifyClickOnWatchableLogoFromMyWatchlistPageNavigatesHomePage;
import comcast.test.app.testCases.myWatchlist.VerifyClickingOnFooterWatchableLogoFromMyShowsPageNavigatesHomePage;
import comcast.test.app.testCases.myWatchlist.VerifyClickingOnHomeFooterLinkFromMyShowsPageNavigatesHomePage;
import comcast.test.app.testCases.myWatchlist.VerifyDisplayOfHeaderAndFooterInMyShowsPage;
import comcast.test.app.testCases.myWatchlist.VerifyMoreShowsButtonInShowsSectionWhenNoFollowedShows;
import comcast.test.app.testCases.myWatchlist.VerifyMyWatchlistPageContentWhenVideosNotPresent;
import comcast.test.app.testCases.myWatchlist.VerifyMyWatchlistPageContentWhenVideosPresent;
import comcast.test.app.testCases.myWatchlist.VerifyMyWatchlistPageTitle;
import comcast.test.app.testCases.myWatchlist.VerifyMyWatchlistPageVideosSectionDetails;
import comcast.test.app.testCases.myWatchlist.VerifyNavigatingToAllShowsPageFromMyShowsPage;
import comcast.test.app.testCases.myWatchlist.VerifyNavigatingToChannelPageFromMyWatchlist;
import comcast.test.app.testCases.myWatchlist.VerifyNavigatingToChannelPageFromMyWatchlistPage;
import comcast.test.app.testCases.myWatchlist.VerifyNavigatingToMyWatchlistAfterLogin;
import comcast.test.app.testCases.myWatchlist.VerifyNavigatingToMyWatchlistAfterLoginFromPopup;
import comcast.test.app.testCases.myWatchlist.VerifyNavigatingToShowPageAfterClickingOnShowTitle;
import comcast.test.app.testCases.myWatchlist.VerifyNavigatingToShowsPageFromFeaturedShowsSectionOfMyShows;
import comcast.test.app.testCases.myWatchlist.VerifyUserNavigatingToHomePageLogoutFromMyWatchlist;
import comcast.test.app.testCases.myWatchlist.VeriyClickOnMyWatchlistWithOutLogin;
import comcast.test.app.testCases.myWatchlist.VeriyMyWatchlistTitle;
import comcast.test.app.testCases.playLists.VerifyAllPlayListsPageContents;
import comcast.test.app.testCases.playLists.VerifyClickOnWatchableLogoFromAllPlayListsPageNavigatesHomePage;
import comcast.test.app.testCases.playLists.VerifyClickingOnFooterWatchableLogoFromPlayListsPageNavigatesHomePage;
import comcast.test.app.testCases.playLists.VerifyClickingOnHomeFooterLinkFromPlayListsPageNavigatesHomePage;
import comcast.test.app.testCases.playLists.VerifyCopyPlayListUrlButton;
import comcast.test.app.testCases.playLists.VerifyDataDisplayingInAllPlayListsPage;
import comcast.test.app.testCases.playLists.VerifyDisplayOfHeaderAndFooterInPlayListsPage;
import comcast.test.app.testCases.playLists.VerifyGenreDisplayingOnPlayList;
//import comcast.test.app.testCases.playLists.VerifyNavigatingToVideoPageClickingOnGenreButtonFromPlayList;
import comcast.test.app.testCases.playLists.VerifyNavigatingToVideoPageClickingOnPlayIconFromPlayList;
import comcast.test.app.testCases.playLists.VerifyNavigatingToVideoPageClickingOnPlayListDescFromPlayList;
import comcast.test.app.testCases.playLists.VerifyNavigatingToVideoPageClickingOnPlayListImgFromPlayList;
import comcast.test.app.testCases.playLists.VerifyNavigatingToVideoPageClickingOnPlayListTitleFromPlayList;
import comcast.test.app.testCases.playLists.VerifyNavigatingToVideoPageClickingOnPlayListVideoDataFromPlayList;
//import comcast.test.app.testCases.playLists.VerifyNavigatingToVideoPageClickingOnPlayListVideoDetailFromPlayList;
//import comcast.test.app.testCases.playLists.VerifyNavigatingToVideoPageClickingOnWatchLinkFromPlayList;
import comcast.test.app.testCases.playLists.VerifyPlayListEmailSharringFormCloseButton;
import comcast.test.app.testCases.playLists.VerifyPlayListEmailSharringFromEmailContent;
import comcast.test.app.testCases.playLists.VerifyPlayListEmailSharringFromEmailContentLoginWithUserName;
import comcast.test.app.testCases.playLists.VerifyPlayListEmailSharringFunctionality;
import comcast.test.app.testCases.playLists.VerifyPlayListEmailSharringPopuoWindowContents;
import comcast.test.app.testCases.playLists.VerifyPlayListShareOptionInVideoPage;
import comcast.test.app.testCases.playLists.VerifyPlayListSharingFaceBookFunctionality;
import comcast.test.app.testCases.playLists.VerifyPlayListSharingFormMessageContent;
import comcast.test.app.testCases.playLists.VerifyPlayListSharingSendFunctionality;
import comcast.test.app.testCases.playLists.VerifyPlayListSharingSendWithBlankFields;
import comcast.test.app.testCases.playLists.VerifyPlayListSharingSendWithInvalidEmails;
import comcast.test.app.testCases.playLists.VerifyPlayListSharingSendWithInvalidFromEmail;
import comcast.test.app.testCases.playLists.VerifyPlayListSharingSendWithInvalidToEmail;
import comcast.test.app.testCases.playLists.VerifyPlayListSharingTwitterFunctionality;
import comcast.test.app.testCases.playLists.VerifyPlayListSharingWithoutLogin;
import comcast.test.app.testCases.playLists.VerifyPlaylistDetailDisplayingInVideoPage;
import comcast.test.app.testCases.playLists.VerifySinglePlayListContents;
import comcast.test.app.testCases.playLists.VerifyUserNavigatingToHomePageLogoutFromAllPlayListsPage;
import comcast.test.app.testCases.playLists.VerifyVideoPageTitleNavigatingFromPlayList;
import comcast.test.app.testCases.playLists.VeriyPlayListsPageTitle;
import comcast.test.app.testCases.playLists.VeriyPlayListsTitle;
import comcast.test.app.testCases.playerVideoPage.VerifyChannelNameOfCurrentPlayingVideo;
import comcast.test.app.testCases.playerVideoPage.VerifyClickOnWatchableLogoFromVideoPageNavigatesHomePage;
import comcast.test.app.testCases.playerVideoPage.VerifyClickingOnHomeFooterLinkFromVideoPageNavigatesHomePage;
import comcast.test.app.testCases.playerVideoPage.VerifyClickingOnWatchableFooterLogoFromVideoPageNavigatesHomePage;
import comcast.test.app.testCases.playerVideoPage.VerifyControlsOnVideoPlayerDuringPause;
import comcast.test.app.testCases.playerVideoPage.VerifyControlsOnVideoPlayerDuringPlay;
//import comcast.test.app.testCases.playerVideoPage.VerifyCurrentBandwidthValueDisplay;
import comcast.test.app.testCases.playerVideoPage.VerifyCurrentDuration;
import comcast.test.app.testCases.playerVideoPage.VerifyCurrentPlayingVideoTitle;
import comcast.test.app.testCases.playerVideoPage.VerifyDisplayOfHeaderAndFooterInVideoPage;
import comcast.test.app.testCases.playerVideoPage.VerifyMetadataDisplayedMouseOverOnVideo;
//import comcast.test.app.testCases.playerVideoPage.VerifyLikeAfterLogin;
//import comcast.test.app.testCases.playerVideoPage.VerifyLikeWithoutLogin;
import comcast.test.app.testCases.playerVideoPage.VerifyNavigatingToChannelPageFromVideoPage;
import comcast.test.app.testCases.playerVideoPage.VerifyNavigatingToShowPageOnClickingShowTitleFromUpNextSection;
import comcast.test.app.testCases.playerVideoPage.VerifyNavigatingToVideoPageFromChannelPage;
import comcast.test.app.testCases.playerVideoPage.VerifyNavigatingToVideoPageFromHomePage;
import comcast.test.app.testCases.playerVideoPage.VerifyNavigatingToVideoPageFromMyWatchlistPage;
import comcast.test.app.testCases.playerVideoPage.VerifyNavigatingToVideoPageFromSearchResultPage;
import comcast.test.app.testCases.playerVideoPage.VerifyPartiallyPlayedVideo;
import comcast.test.app.testCases.playerVideoPage.VerifyPauseFunctionality;
import comcast.test.app.testCases.playerVideoPage.VerifyPlayFromResumePoint;
import comcast.test.app.testCases.playerVideoPage.VerifyPlayFromStartPoint;
import comcast.test.app.testCases.playerVideoPage.VerifyReportAfterLogin;
import comcast.test.app.testCases.playerVideoPage.VerifyReportCancelAfterLogin;
import comcast.test.app.testCases.playerVideoPage.VerifyReportWithoutLogin;
import comcast.test.app.testCases.playerVideoPage.VerifyShowTitleInUpNextSectionInVideoPage;
import comcast.test.app.testCases.playerVideoPage.VerifyUpNexSectionInVideoPage;
import comcast.test.app.testCases.playerVideoPage.VerifyUpNexSectionNextButton;
import comcast.test.app.testCases.playerVideoPage.VerifyUpNexSectionPreviousButton;
import comcast.test.app.testCases.playerVideoPage.VerifyUserNavigatingToHomePageLogoutFromVideoPage;
import comcast.test.app.testCases.playerVideoPage.VerifyVideoContentsWhenPlayPaused;
import comcast.test.app.testCases.playerVideoPage.VerifyVideoPageTitle;
import comcast.test.app.testCases.playerVideoPage.VerifyVideoTotalDuration;
import comcast.test.app.testCases.providerPage.VerifyChannelSection;
import comcast.test.app.testCases.providerPage.VerifyChannelVideoCount;
import comcast.test.app.testCases.providerPage.VerifyClickOnWatchableLogoFromProviderPageNavigatesHomePage;
import comcast.test.app.testCases.providerPage.VerifyClickingOnFooterWatchableLogoFromProviderPageNavigatesHomePage;
import comcast.test.app.testCases.providerPage.VerifyClickingOnHomeFooterLinkFromProviderPageNavigatesHomePage;
import comcast.test.app.testCases.providerPage.VerifyDisplayOfHeaderAndFooterInProviderPage;
import comcast.test.app.testCases.providerPage.VerifyNavigationToProviderPage;
import comcast.test.app.testCases.providerPage.VerifyNavigationToProviderPageFromFeaturedShows;
import comcast.test.app.testCases.providerPage.VerifyProviderDetailPageContent;
import comcast.test.app.testCases.providerPage.VerifyProviderIconDisplayingInProviderPage;
import comcast.test.app.testCases.providerPage.VerifyProviderPageTitle;
import comcast.test.app.testCases.providerPage.VerifyUserNavigatingToHomePageLogoutFromProvidePage;
import comcast.test.app.testCases.providerPage.VerifyingClickOnChannlNavigatingToChannelPage;
import comcast.test.app.testCases.search.SearchWithChannelId;
import comcast.test.app.testCases.search.SearchWithChannelName;
import comcast.test.app.testCases.search.SearchWithDigitsKey;
import comcast.test.app.testCases.search.SearchWithInvalidKey;
import comcast.test.app.testCases.search.SearchWithProviderId;
import comcast.test.app.testCases.search.SearchWithProviderName;
import comcast.test.app.testCases.search.SearchWithSpecialCharacters;
import comcast.test.app.testCases.search.SearchWithVideoId;
import comcast.test.app.testCases.search.SearchWithVideoName;
import comcast.test.app.testCases.search.VerifyBackToHomepageLinkWhenNoResult;
import comcast.test.app.testCases.search.VerifyClickOnWatchableLogoFromSearchResultPageNavigatesHomePage;
import comcast.test.app.testCases.search.VerifyClickingOnFooterWatchableLogoFromSearchResultPageNavigatesHomePage;
import comcast.test.app.testCases.search.VerifyClickingOnHomeFooterLinkFromSearchResultPageNavigatesHomePage;
import comcast.test.app.testCases.search.VerifyDisplayOfHeaderAndFooterInSearchResultPage;
import comcast.test.app.testCases.search.VerifyNavigatingToShowPageFromShowSectionFromSearchResult;
import comcast.test.app.testCases.search.VerifyNavigatingToShowPageFromVideoSectionFromSearchResult;
import comcast.test.app.testCases.search.VerifySearchResultPageContentWithOutResult;
import comcast.test.app.testCases.search.VerifySearchResultPageContentWithResult;
import comcast.test.app.testCases.search.VerifySearchResultPageTitle;
import comcast.test.app.testCases.search.VerifyUserNavigatingToHomePageLogoutFromSearchResultPage;
import comcast.test.app.testCases.signUp.RegToWatchableByEnteringBlankUserName;
import comcast.test.app.testCases.signUp.RegToWatchableByEnteringExistingEmailID;
import comcast.test.app.testCases.signUp.RegToWatchableByEnteringExistingUserName;
import comcast.test.app.testCases.signUp.RegToWatchableByEnteringInValidEmail;
import comcast.test.app.testCases.signUp.RegToWatchableByEnteringInValidLengthUserName;
import comcast.test.app.testCases.signUp.RegToWatchableByEnteringInValidUserName;
//import comcast.test.app.testCases.signUp.RegToWatchableByProvidingDifferentConfPass;
//import comcast.test.app.testCases.signUp.RegToWatchableWithoutEnteringConfPass;
import comcast.test.app.testCases.signUp.RegToWatchableWithoutEnteringEmail;
import comcast.test.app.testCases.signUp.RegToWatchableWithoutProvidingAnyDetails;
import comcast.test.app.testCases.signUp.RegToWatchableWithoutSelectingACheckBox;
import comcast.test.app.testCases.signUp.RegisterToWatchableByEnteringInValidLengthOfPassword;
import comcast.test.app.testCases.signUp.RegisterToWatchableByEnteringNonCapitalLetterPassword;
import comcast.test.app.testCases.signUp.RegisterToWatchableByEnteringNonDigitPassword;
import comcast.test.app.testCases.signUp.RegisterToWatchableWithoutEnteringPassword;
import comcast.test.app.testCases.signUp.ValidateCaptchaMandarotyField;
import comcast.test.app.testCases.signUp.VerifyCaptchaButton;
import comcast.test.app.testCases.signUp.VerifyCaptchaPrivacyLink;
import comcast.test.app.testCases.signUp.VerifyCaptchaTermsLink;
import comcast.test.app.testCases.signUp.VerifyPresenceOfPrivacyPolicyLinkInSignUpForm;
import comcast.test.app.testCases.signUp.VerifyPresenceOfTermsOfServiceLinkInSignUpForm;
import comcast.test.app.testCases.signUp.VerifyPrivacyPolicyLinkClickableInSignUpForm;
import comcast.test.app.testCases.signUp.VerifySignUpFormCloseButton;
import comcast.test.app.testCases.signUp.VerifySignUpPageDirectURL;
import comcast.test.app.testCases.signUp.VerifyTermsOfServiceAndPrivacyPolicyUncheckedByDefault;
import comcast.test.app.testCases.signUp.VerifyTermsOfServiceLinkClickableInSignUpForm;
import comcast.test.app.testCases.signUp.VeriyCaptchaContents;
import comcast.test.app.testCases.signUp.VeriySignUpPageContent;
import comcast.test.app.testCases.socialSharing.VerifyCopyUrlFunctionalityFromVideoControls;
import comcast.test.app.testCases.socialSharing.VerifyEmailFunctionalityFromVideoControls;
import comcast.test.app.testCases.socialSharing.VerifyEmailSharingFormCloseButton;
import comcast.test.app.testCases.socialSharing.VerifyEmailSharingFormMessageContent;
import comcast.test.app.testCases.socialSharing.VerifyEmailSharingSendFunctionality;
import comcast.test.app.testCases.socialSharing.VerifyEmailSharingSendWithBlankFields;
import comcast.test.app.testCases.socialSharing.VerifyEmailSharingSendWithInvalidEmails;
import comcast.test.app.testCases.socialSharing.VerifyEmailSharingSendWithInvalidFromEmail;
import comcast.test.app.testCases.socialSharing.VerifyEmailSharingSendWithInvalidToEmail;
import comcast.test.app.testCases.socialSharing.VerifyEmailSharringPopuoWindowContents;
import comcast.test.app.testCases.socialSharing.VerifyFacebookFunctionalityFromVideoControls;
import comcast.test.app.testCases.socialSharing.VerifyPresenceOfSocialSharingFunctionalityInVideoControls;
import comcast.test.app.testCases.socialSharing.VerifyTwitterFunctionalityFromVideoControls;
import comcast.test.app.testCases.socialSharing.VerifyVideoEmailSharringFromEmailContent;
import comcast.test.app.testCases.socialSharing.VerifyVideoEmailSharringFromEmailContentLoginWithUserName;
import comcast.test.app.testCases.socialSharing.VerifyVideoEmailSharringWithoutLogin;


@RunWith(Suite.class)
@Suite.SuiteClasses({

	
	 // Home Page Test Cases 
		 VerifyAllHomeCategoriesAreDisplayed.class,
		 VerifyHeaderlinksWithoutLogin.class,
		 VerifyHeaderlinksWithLogin.class,
		 VerifyFooterlinksWithoutLogin.class,
		 VerifyFooterlinksWithLogin.class,
		 VerifyClickingOnWatchableHeaderLogoNavigatesHomePage.class,
		 VerifyClickingOnWatchableFooterLogoNavigatesHomePage.class,
		 VerifyFeaturedPlaylistsAreDisplayed.class,
		 VerifySixVideosDisplayedInFeaturedPlaylistsSection.class,
		 VerifySelectedVideoDetailsInFeaturedPlaylists.class,
		 VerifyGenreButtonDisplayedInFeaturedPlaylistsVideos.class,
		 VerifyFeaturedVideosAreDisplayed.class,
		 VerifyFeaturedChannelsAreDisplayed.class,
		// VerifyAllGenreCategories.class,
		// VerifyAllGenreChannelsCategories.class,
		 VerifyEightVideosDisplayedInFeaturedVideosSection.class,
		 VerifyEightChannelsDisplayedInFeaturedShowSection.class,
		 VerifyHomePageTitle.class, 
		 VerifyWatchButtonDisplayedInFeaturedPlaylistsVideos.class,
		 VerifyPlayIconDisplayedInFeaturedPlaylistsVideos.class,
		 VerifyFooterWatchableLogoNotClickableInHomePage.class,
		 VerifyFooterHomeLinkNotClickableInHomePage.class,
		 VerifyHeaderWatchableLogoNotClickableInHomePage.class,
		 VerifyDisplayOfCopyRightTextInFooter.class,
		 VerifyWatchableLogoNotClickabeInHomePage.class,
		 VerifyHomeFooterLinkNotClickabeInHomePage.class,
		 VerifySignupButtonIsSelectedByDefault.class,
		 VerifySearchTextBoxHiddenByDefault.class,
		 VerifyHeaderLogoMenuSeparaterDisplay.class,
		 VerifyFeaturedShowSectionContainsMoreShowsButton.class,
		 VerifyNavigatingToAllShowsPageClickingOnMoreShowsButton.class,
		 VerifyPresenceOfSocialSharingOptionsInHomePage.class,
		 VerifyFaceBookSharingFromHomePage.class,
		 VerifyTwitterSharingFromHomePage.class,
		 VerifyInstagramSharingFromHomePage.class,
		 VerifyDataDisplayingInAllHomePageSections.class,
		 VerifySearchTextBoxBehaviour.class,
		
	
		 // Login functionality Test Cases 
		 VeriyLogInPageContent.class,
		 VerifyLoginPageDetailsWithEmptyFields.class,
		 LoginToWatchableUsingDigits.class,
		 LoginToWatchableUsingInValidPassword.class,
		 LoginToWatchableUsingInValidUserName.class,
		 LoginToWatchableUsingJavaScript.class,
		 LoginToWatchableUsingSpecialCharacters.class,
		 LoginToWatchableUsingSQLKeyWords.class,
		 LoginToWatchableUsingSQLStatement.class,
		 LoginToWatchableWithInValidCredentials.class,
		 VerifyLoginPageMandatoryFields.class,
		 LoginToWatchableWithValidCredentials.class,
		 ValidateRememberMeFunctionality.class,
		 VerifyLogoutFromWatchable.class,
		 VerifyLogInFormCloseButton.class,
		 VerifyUserProfileMenu.class,
		 VerifyLoginPageDirectURL.class,
		 LoginToWatchableWithValidUserName.class,
		 LoginToWatchableWithInValidUserName.class,
		 LoginToWatchableWithNonExistingUserName.class,
		 LoginToWatchableWithInvalidLengthUserName.class,
		 LoginToWatchableWithBlankUserName.class,
		 VerifyRememberMeCheckedByDefault.class,
		 
		 	 
		 // Forgot Password Test Cases 
		 VeriyForgotPasswordPageContent.class,
		 VerifyForgotPasswordPageDetailsWithEmptyFields.class,
		 VerifyForgotPasswordFunctionalityWithNoEmail.class,
		 VerifyForgotPasswordWithInValidEmailIdFormat.class,
		 VerifyForgotPasswordWithInValidEmailId.class,
		 VerifyForgotPasswordFunctionalityWithValidEmail.class,
		 VerifyForgotPasswordFormCloseButton.class,
		 
		 
		 // Reset Password Test Cases 
		 VeriyResetPasswordPageContent.class,
		 VerifyChangePasswordPageDetailsWithEmptyFields.class,
		 VerifyChangePasswordMandatoryFields.class,
		 ValidateChangePassByEnteringCurrentPassword.class,
		 ValidateCurrentPasswordWhenChangingPassword.class,
		 ValidateNewPasswordAndConfirmPasswordMatch.class,
		 VerifyChangePasswordFunctionality.class,
		 VerifyResetPasswordFormCloseButton.class, 
		 
		 
		 // Sign Up Test Cases 
		 VeriySignUpPageContent.class,
		 RegToWatchableWithoutProvidingAnyDetails.class,
		 //ValidateCaptchaByEnteringInvalidData.class,
		 ValidateCaptchaMandarotyField.class, 
		 //VerifyCaptchaHelpPage.class,
		 RegToWatchableByEnteringExistingEmailID.class,
		 RegToWatchableByEnteringInValidEmail.class,
		 RegToWatchableWithoutEnteringEmail.class,
		 //RegToWatchableByProvidingDifferentConfPass.class,
		// RegToWatchableWithoutEnteringConfPass.class,
		 RegisterToWatchableByEnteringInValidLengthOfPassword.class,
		 RegisterToWatchableByEnteringNonCapitalLetterPassword.class,
		 RegisterToWatchableByEnteringNonDigitPassword.class,
		 RegisterToWatchableWithoutEnteringPassword.class,
		 RegToWatchableWithoutSelectingACheckBox.class,
		 //VerifyOpeningSignUpPageClickingOnSignUPLinkFromFooterWithoutLogin.class, 
		 //VerifyTermsAndConditionsPage.class,
		 //VerifyTermsAndConditionsPageAccept.class,
		 //VerifyTermsAndConditionsPageDecline.class, 
		 //VerifyCaptchaAudio.class,
		 VerifySignUpFormCloseButton.class,
		 //VerifyTermsAndConditionsFormCloseButton.class,
		 VerifySignUpPageDirectURL.class,
		 VeriyCaptchaContents.class,
		 VerifyCaptchaButton.class,
		 VerifyCaptchaPrivacyLink.class,
		 VerifyCaptchaTermsLink.class, 
		 VerifyPresenceOfTermsOfServiceLinkInSignUpForm.class,
		 VerifyPresenceOfPrivacyPolicyLinkInSignUpForm.class,
		 VerifyPrivacyPolicyLinkClickableInSignUpForm.class,
		 VerifyTermsOfServiceLinkClickableInSignUpForm.class,
		 RegToWatchableByEnteringExistingUserName.class,
		 RegToWatchableByEnteringInValidUserName.class,
		 RegToWatchableByEnteringBlankUserName.class,
		 RegToWatchableByEnteringInValidLengthUserName.class,
		 VerifyTermsOfServiceAndPrivacyPolicyUncheckedByDefault.class,
		 
		  
		   // Contact US Test Cases 
		  VeriyContactUsPageContent.class,
		  VerifyContactUsMandatoryFields.class,
		 // VerifyResetButtonFunctionality.class,
		  ValidateCaptchaByEnteringInvalidKey.class,
		  VerifyContactUsFormCloseButton.class,
		  VeriyContactUsCaptchaButton.class,
		  VeriyContactUsCaptchaPrivacyLink.class,
		  VeriyContactUsCaptchaTermsLink.class,
		  VeriyContactUsEmailFieldPopulatedWithEmailLoginWithUserName.class,
		  VeriyContactUsEmailFieldPopulatedWithEmailLoginWithEmail.class,
		  VerifyEmailByEnteringInvalidValue.class,
		  VeriyContactUsHiddenFields.class,
		  VeriyMessageEmailFieldDisplayedSelectingReason.class,
		  
		
		  // All Shows Test Cases 
		  VeriyAllChannelsTitle.class,
		  VeriyAllChannelsPage.class,
		  VerifyClickOnWatchableLogoFromAllShowsPageNavigatesHomePage.class,
		  VeriyAllShowsPageTitle.class,
		  VerifyClickOnHomeFooterLinkFromAllShowsPageNavigatesHomePage.class,
		  VerifyUserNavigatingToHomePageLogoutFromAllShowsPage.class,
		  VeriyNavigatingToShowsPageFromShowsByGenrePage.class,
		  VerifyMoreLinkDisplayedInGenreShowSection.class,
		  VerifyClickOnFooterWatchableLogoFromAllShowsPageNavigatesHomePage.class,
		  VeriyDataDisplayingInAllChannelsPage.class,
		  VerifyDisplayOfHeaderAndFooterInShowByGenrePage.class,
		  
		  
		  // Footer Test Cases
		  VerifyClickingOnHomeFooterLinkNavigatesHomePage.class,
		  VerifyHelpLinkTitle.class, 
		  VerifyHelpLink.class,
		  VerifyPrivacyPolicyLinkTitle.class, 
		  VerifyPrivacyPolicyLink.class,
		  VerifyTermsOfUseLinkTitle.class, 
		  VerifyTermsOfUseLink.class,
		  VerifyAdChoicesLinkTitle.class, 
		  VerifyAdChoicesLink.class,
		  VerifyClickOnWatchableLogoFromHelpPageNavigatesHomePage.class,
		  VerifyCopyRightText.class,
		  VerifyHelpPageTitle.class,
		 // VerifyTermsOfServicePageTitle.class,
		 // VerifyClickOnWatchableLogoFromTermsServicePageNavigatesHomePage.class,
		 // VerifyClickOnWatchableLogoFromPrivacyPolicyPageNavigatesHomePage.class,
		 // VerifyPrivacyPolicyPageTitle.class,
		  VerifyClickingOnHomeFooterLinkFromHelpPageNavigatesHomePage.class,
		 // VerifyClickingOnHomeFooterLinkFromPrivacyPolicyPageNavigatesHomePage.class,
		 // VerifyClickingOnHomeFooterLinkFromTermsOfServicePageNavigatesHomePage.class,
		  VerifyUserNavigatingToHomePageLogoutFromHelpPage.class,
		  VerifyDisplayOfHeaderAndFooterInHelpPage.class,

		  
		 
		  // Show Detail Page Test Cases
		  VerifyNavigationToChannelPage.class,
		  VerifyChannelDetailPageContent.class,
		  VerifyChannelDetailPageVideoSectionContent.class,
		  VerifyOtherChannelsSectionContent.class,
		  VerifyNavigationToProviderPageFromOtherChannelsSection.class,
		  VerifyNextButton.class, 
		  VerifyPreviousButton.class,
		  VeriyVideoLastUpdatedInChannelPage.class,
		  VerifyingClickOnChannlFromOtherChannelsSection.class,
		  VerifyChannelPageTitle.class,
		  VerifyNavigationToChannelPageFromFeaturedShows.class,
		  VerifyClickOnWatchableLogoFromShowPageNavigatesHomePage.class,
		  VerifyClickingOnHomeFooterLinkFromShowPageNavigatesHomePage.class,
		  VerifyUserNavigatingToHomePageLogoutFromShowsPage.class,
		  VerifyClickingOnFooterWatchableLogoFromShowPageNavigatesHomePage.class,
		  VerifyShowIconDisplayingInShowPage.class,
		  VerifyDisplayOfHeaderAndFooterInShowPage.class,

		  
		  // Provider Detail Page Test Cases
		  VerifyNavigationToProviderPage.class,
		  VerifyProviderDetailPageContent.class, 
		  VerifyChannelSection.class,
		  VerifyChannelVideoCount.class,
		  VerifyingClickOnChannlNavigatingToChannelPage.class,
		  VerifyClickOnWatchableLogoFromProviderPageNavigatesHomePage.class,
		  VerifyProviderPageTitle.class,
		  VerifyNavigationToProviderPageFromFeaturedShows.class,
		  VerifyClickingOnHomeFooterLinkFromProviderPageNavigatesHomePage.class,
		  VerifyUserNavigatingToHomePageLogoutFromProvidePage.class,
		  VerifyClickingOnFooterWatchableLogoFromProviderPageNavigatesHomePage.class,
		  VerifyProviderIconDisplayingInProviderPage.class,
		  VerifyDisplayOfHeaderAndFooterInProviderPage.class,
		
		  
		// Search Test Cases
		VerifySearchResultPageContentWithResult.class,
		VerifySearchResultPageContentWithOutResult.class,
		SearchWithChannelName.class, 
		SearchWithChannelId.class,
		SearchWithVideoName.class, 
		SearchWithVideoId.class,
		SearchWithProviderName.class, 
		SearchWithProviderId.class,
		SearchWithInvalidKey.class, 
		SearchWithDigitsKey.class,
		SearchWithSpecialCharacters.class,
		VerifyBackToHomepageLinkWhenNoResult.class,
		VerifyClickOnWatchableLogoFromSearchResultPageNavigatesHomePage.class,
		VerifySearchResultPageTitle.class,
		VerifyNavigatingToShowPageFromShowSectionFromSearchResult.class,
		VerifyNavigatingToShowPageFromVideoSectionFromSearchResult.class,
		VerifyClickingOnHomeFooterLinkFromSearchResultPageNavigatesHomePage.class,
		VerifyUserNavigatingToHomePageLogoutFromSearchResultPage.class,
		VerifyClickingOnFooterWatchableLogoFromSearchResultPageNavigatesHomePage.class,
		VerifyDisplayOfHeaderAndFooterInSearchResultPage.class,
		//VerifyShowAllLink.class,
		//VerifyShowLessLink.class, 
		
		
			
	
		//My Shows list test cases
		VeriyMyWatchlistTitle.class,
		VeriyClickOnMyWatchlistWithOutLogin.class,
		VerifyNavigatingToMyWatchlistAfterLoginFromPopup.class,
		VerifyNavigatingToMyWatchlistAfterLogin.class,
		//VerifyGoToChannelOption.class,
		VerifyNavigatingToChannelPageFromMyWatchlistPage.class,
		VerifyChannelNameDisplayInMyWatchlistPageWhenVideosPresent.class,
		VerifyMyWatchlistPageContentWhenVideosPresent.class,
		VerifyMyWatchlistPageContentWhenVideosNotPresent.class,
		VerifyNavigatingToChannelPageFromMyWatchlist.class,
		VerifyUserNavigatingToHomePageLogoutFromMyWatchlist.class,
		VerifyClickOnWatchableLogoFromMyWatchlistPageNavigatesHomePage.class,
		VerifyMyWatchlistPageTitle.class,
		VerifyNavigatingToShowsPageFromFeaturedShowsSectionOfMyShows.class,
		VerifyMyWatchlistPageVideosSectionDetails.class,
		VerifyNavigatingToShowPageAfterClickingOnShowTitle.class,
		VerifyClickingOnHomeFooterLinkFromMyShowsPageNavigatesHomePage.class,
		VerifyMoreShowsButtonInShowsSectionWhenNoFollowedShows.class,
		VerifyNavigatingToAllShowsPageFromMyShowsPage.class,
		VerifyClickingOnFooterWatchableLogoFromMyShowsPageNavigatesHomePage.class,
		VerifyDisplayOfHeaderAndFooterInMyShowsPage.class,
		
	
		//Follow US test cases
		VerifyFollowFromChannelPageWithoutLogin.class,
		VerifyFollowFromVideoPageWithoutLogin.class,
		VerifyFollowFromVideoControlWithoutLogin.class,
		VerifyFollowFromChannelPageAfterLogin.class,
		VerifyFollowFromVideoPageAfterLogin.class,
		VerifyFollowFromVideoControlAfterLogin.class,
		VerifyUnfollowConfirmationPopupDisplay.class,
		//VerifyUnfollowConfirmationPopupContent.class,
		//VerifyUnfollowConfirmationCancelFunctionality.class,
		//VerifyUnfollowConfirmationConfirmFunctionality.class,
		VerifyUnfollowFromChannelPage.class,
		VerifyUnfollowFromVideoPage.class,
		VerifyUnfollowFromVideoPlayerControls.class,
		VerifyFollowConfirmationPopupDisplay.class, 
		VerifyFollowButtonLabelAfterSuccessfulFollow.class,
		VerifyFollowButtonLabelAfterSuccessfulUnFollow.class,



				
		//Social Sharing test cases
		//VerifyPresenceOfSocialSharingFunctionalityInVideoPage.class,
		VerifyPresenceOfSocialSharingFunctionalityInVideoControls.class,
		//VerifyFacebookFunctionalityFromVideoPage.class,
		VerifyFacebookFunctionalityFromVideoControls.class,
		//VerifyTwitterFunctionalityFromVideoPage.class,
		VerifyTwitterFunctionalityFromVideoControls.class,
		//VerifyEmailFunctionalityFromVideoPage.class,
		VerifyEmailFunctionalityFromVideoControls.class,
		VerifyEmailSharringPopuoWindowContents.class,
		VerifyEmailSharingFormMessageContent.class,
		VerifyEmailSharingFormCloseButton.class,
		VerifyEmailSharingSendWithBlankFields.class,
		VerifyEmailSharingSendFunctionality.class,
		VerifyEmailSharingSendWithInvalidEmails.class,
		VerifyEmailSharingSendWithInvalidFromEmail.class,
		VerifyEmailSharingSendWithInvalidToEmail.class,
		VerifyCopyUrlFunctionalityFromVideoControls.class, 
		VerifyVideoEmailSharringFromEmailContent.class,
		VerifyVideoEmailSharringWithoutLogin.class,
		VerifyVideoEmailSharringFromEmailContentLoginWithUserName.class,
		
		
		
		//Play Lists test cases
		VeriyPlayListsTitle.class, 
		VeriyPlayListsPageTitle.class,
		VerifyClickOnWatchableLogoFromAllPlayListsPageNavigatesHomePage.class,
		VerifyAllPlayListsPageContents.class,
		VerifySinglePlayListContents.class,
		VerifyVideoPageTitleNavigatingFromPlayList.class,
		//VerifyNavigatingToVideoPageClickingOnWatchLinkFromPlayList.class,
		VerifyNavigatingToVideoPageClickingOnPlayIconFromPlayList.class,
		//VerifyNavigatingToVideoPageClickingOnGenreButtonFromPlayList.class,
		VerifyNavigatingToVideoPageClickingOnPlayListImgFromPlayList.class,
		VerifyNavigatingToVideoPageClickingOnPlayListTitleFromPlayList.class,
		VerifyNavigatingToVideoPageClickingOnPlayListDescFromPlayList.class,
		VerifyNavigatingToVideoPageClickingOnPlayListVideoDataFromPlayList.class,
		//VerifyNavigatingToVideoPageClickingOnPlayListVideoDetailFromPlayList.class,
		VerifyPlayListShareOptionInVideoPage.class,
		VerifyCopyPlayListUrlButton.class,
		VerifyPlayListEmailSharringPopuoWindowContents.class,
		VerifyPlayListEmailSharringFormCloseButton.class,
		VerifyPlayListEmailSharringFunctionality.class,
		VerifyPlayListSharingFormMessageContent.class,
		VerifyPlayListSharingSendFunctionality.class,
		VerifyPlayListSharingSendWithBlankFields.class,
		VerifyPlayListSharingSendWithInvalidEmails.class,
		VerifyPlayListSharingSendWithInvalidFromEmail.class,
		VerifyPlayListSharingSendWithInvalidToEmail.class,
		VerifyPlayListSharingTwitterFunctionality.class,
		VerifyPlayListSharingFaceBookFunctionality.class,
		VerifyClickingOnHomeFooterLinkFromPlayListsPageNavigatesHomePage.class,
		VerifyUserNavigatingToHomePageLogoutFromAllPlayListsPage.class,
		VerifyPlaylistDetailDisplayingInVideoPage.class,
		VerifyClickingOnFooterWatchableLogoFromPlayListsPageNavigatesHomePage.class,
		VerifyDataDisplayingInAllPlayListsPage.class,
		VerifyGenreDisplayingOnPlayList.class,
		VerifyDisplayOfHeaderAndFooterInPlayListsPage.class,
		VerifyPlayListSharingWithoutLogin.class,
		VerifyPlayListEmailSharringFromEmailContent.class,
		VerifyPlayListEmailSharringFromEmailContentLoginWithUserName.class,

		
		
			//Video Page test cases
		VerifyNavigatingToVideoPageFromHomePage.class,
		VerifyNavigatingToVideoPageFromChannelPage.class,
		VerifyNavigatingToVideoPageFromSearchResultPage.class,
		VerifyNavigatingToVideoPageFromMyWatchlistPage.class,
		VerifyControlsOnVideoPlayerDuringPlay.class,
		VerifyControlsOnVideoPlayerDuringPause.class,
		VerifyCurrentDuration.class,
		VerifyVideoTotalDuration.class,
		VerifyCurrentPlayingVideoTitle.class,
		VerifyChannelNameOfCurrentPlayingVideo.class,
		VerifyNavigatingToChannelPageFromVideoPage.class,
		VerifyPauseFunctionality.class,
		//VerifyLikeWithoutLogin.class,
		VerifyReportWithoutLogin.class,
		//VerifyLikeAfterLogin.class,
		VerifyReportAfterLogin.class,
		VerifyReportCancelAfterLogin.class,
		VerifyPartiallyPlayedVideo.class,
		VerifyPlayFromStartPoint.class,
		VerifyPlayFromResumePoint.class,
		VerifyClickOnWatchableLogoFromVideoPageNavigatesHomePage.class,
		//VerifyCurrentBandwidthValueDisplay.class,
		VerifyVideoPageTitle.class, 
		VerifyVideoContentsWhenPlayPaused.class,
		VerifyUpNexSectionInVideoPage.class,
		VerifyShowTitleInUpNextSectionInVideoPage.class,
		VerifyNavigatingToShowPageOnClickingShowTitleFromUpNextSection.class,
		VerifyMetadataDisplayedMouseOverOnVideo.class,
		VerifyClickingOnHomeFooterLinkFromVideoPageNavigatesHomePage.class,
		VerifyUserNavigatingToHomePageLogoutFromVideoPage.class,
		VerifyUpNexSectionNextButton.class,
		VerifyUpNexSectionPreviousButton.class,
		VerifyClickingOnWatchableFooterLogoFromVideoPageNavigatesHomePage.class,
		VerifyDisplayOfHeaderAndFooterInVideoPage.class,
		
		//Miscellaneous test cases
		VerifyPageNotFoundPageContent.class,
		VerifyClickOnBacktohomepageLinkFromErrorPageUserNavigatesToHomePage.class,
		VerifyClickOnWatchableLogoFromErrorPageUserNavigatesToHomePage.class,
		VerifyClickOnHomeFooterLinkFromErrorPageUserNavigatesToHomePage.class,
		VerifyClickOnContachUsLinkFromErrorPageOpensContactUsForm.class,
		VerifyNavigatingToVideoPageFromErrorPage.class,
		VerifyNavigatingToShowPageFromErrorPage.class,
		VerifyErrorPageTitle.class,
		VerifyClickOnFooterWatchableLogoFromErrorPageUserNavigatesToHomePage.class,


})
public class runSeleniumTestCasesForQA {

	@AfterClass
	public static void tearDown() throws FileNotFoundException, IOException,
			InterruptedException {
		// Changes the browser for multiple browser execution.
		// @Note: Comment if single browser
		// TestDataGenerator.ChangeBrowser();
	}
}
