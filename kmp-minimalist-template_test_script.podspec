Pod::Spec.new do |spec|
    spec.name                     = 'kmp-minimalist-template_test'
    spec.version                  = '1.0.3'
    spec.homepage                 = 'https://github.com/ahmadAlfhajri/kmp-minimalist-template_test_script'
    spec.source                   = { :http=> 'https://github.com/ahmadAlfhajri/kmp-minimalist-template_test_script/releases/download/1.0.2/XenditFingerprintSDK-1.0.2.zip'}
    spec.authors                  = ''
    spec.license                  = { :type => 'MIT', :text => 'License text'}
    spec.summary                  = 'Some description for the Shared Module'
    spec.libraries                = 'c++'
    spec.platform                 = :ios, '15.0'
    spec.ios.deployment_target    = '15.0'
    spec.vendored_frameworks      = 'shared.xcframework'
    spec.dependency 'XenditFingerprintSDK', '1.0.1'
end
