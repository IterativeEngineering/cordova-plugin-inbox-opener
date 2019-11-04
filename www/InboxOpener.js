var exec = require('cordova/exec');

exports.openInbox = function (arg0, success, error) {
    exec(success, error, 'InboxOpener', 'openInbox', [arg0]);
};
